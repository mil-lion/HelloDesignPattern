/*
 * File:    AbstractFacade.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.db;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 * @param <T>
 */
public abstract class AbstractFacade<T> {

    private static final String DRIVER_CLASS = "org.apache.derby.jdbc.ClientDriver";
    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/sample";
    private static final String DATABASE_USERNAME = "app";
    private static final String DATABASE_PASSWORD = "app";

    protected final String tableName;
    protected final String pkColumn;
    protected final Class<T> entityClass;

    protected Connection connection;

    public AbstractFacade(String tableName, String pkColumn, Class<T> entityClass) {
        this.tableName = tableName;
        this.pkColumn = pkColumn;
        this.entityClass = entityClass;
        connectToDatabase();
    }

    public T find(String id) throws SQLException {
        T entity = null;
        try (PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM " + tableName + " WHERE " + pkColumn + " = ?");) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    entity = EntityFactory.createEntity(rs, entityClass);
                }
            }
        }
        return entity;
    }

    public List<T> findAll() throws SQLException {
        List<T> result = new ArrayList<>();
        try (Statement stmt = connection.createStatement();) {
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName);) {
                while (rs.next()) {
                    result.add(EntityFactory.createEntity(rs, entityClass));
                }
            }
        }
        return result;
    }

    public void remove(String id) throws SQLException {
        try (PreparedStatement pstmt = connection.prepareStatement("DELETE FROM " + tableName + " WHERE " + pkColumn + " = ?");) {
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            connection.commit();
        }
    }

    public int count() throws SQLException {
        int count = 0;
        try (Statement stmt = connection.createStatement();) {
            try (ResultSet rs = stmt.executeQuery("SELECT count(*) FROM " + tableName);) {
                if (rs.next()) {
                    count = rs.getInt(1);
                }
            }
        }
        return count;
    }

    private void connectToDatabase() {
        try {
            Class.forName(DRIVER_CLASS);
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
