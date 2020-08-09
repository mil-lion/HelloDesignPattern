/*
 * File:    ConnectionManager.java
 * Project: HelloDesignPattern
 * Date:    08 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.orm;

import java.sql.*;

/**
 * Менеджер соединений с СУБД (Flyweight)
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class ConnectionManager implements AutoCloseable {

    // TODO сделать пул соединений
    
    private Connection connection;
    
    private final String dbDriverClass;
    private final String dbUrl;
    private final String dbUsername;
    private final String dbPassword;

    /**
     * Конструктор по умолчанию (подключение к СУБД Apache Derby Sample)
     */
    public ConnectionManager() {
        dbDriverClass = "org.apache.derby.jdbc.ClientDriver";
        dbUrl = "jdbc:derby://localhost:1527/sample";
        dbUsername = "app";
        dbPassword = "app";
    }

    /**
     * Конструктор
     * @param dbDriverClass имя класса JDBC драйвера СУБД
     * @param dbUrl JDBC строка соединения к СУБД
     * @param dbUsername имя пользователя СУБД
     * @param dbPassword пароль пользователя СУБД
     */
    public ConnectionManager(String dbDriverClass, String dbUrl, String dbUsername, String dbPassword) {
        this.dbDriverClass = dbDriverClass;
        this.dbUrl = dbUrl;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;
    }
    
    /**
     * Получить соединение с СУБД (connect)
     * @return соединение с СУБД
     * @throws SQLException ошибка подключения к СУБД
     */
    public Connection getConnection() throws SQLException {
        if (connection == null) {
            // static register driver
            //DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
            try {
                // dynamic register driver
                Class.forName(dbDriverClass);
            } catch (ClassNotFoundException ex) {
                throw new SQLException(ex); // Use Adapter
            }
            // DriverManager - Factory Method
            // Connection - Abstract Factory
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        }
        return connection;
    }
    
    /**
     * Отключиться от СУБД (disconnect)
     * @throws SQLException ошибка отключения от СУБД
     */
    @Override
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }
}
