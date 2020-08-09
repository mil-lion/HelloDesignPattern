/*
 * File:    AbstractFacade.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.facade;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.EntityFactory;

/**
 * Абстрактный фасад для работы с сущностями СУБД
 * @param <E> класс сущности
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public abstract class AbstractFacade<E> {

    // **************** Protected **************
    
    protected final Connection connection;
    protected final Class<E> entityClass;
    protected final EntityFactory<E> entityFactory;
    protected final String sqlTextFindAll;
    protected final String sqlTextFindById;
    protected final String sqlTextInsert;
    protected final String sqlTextUpdate;
    protected final String sqlTextDelete;
    protected final String sqlTextCount;

    // **************** Constructors **************

    /**
     * Конструктор Фасада
     * @param entityClass класс сущности 
     */
    public AbstractFacade(Class<E> entityClass, Connection connection) {
        this.connection = connection;
        this.entityClass = entityClass;
        this.entityFactory = new EntityFactory<>(entityClass);
        sqlTextFindAll = entityFactory.getSqlTextFindAll();
        sqlTextFindById = entityFactory.getSqlTextFindById();
        sqlTextInsert = entityFactory.getSqlTextInsert();
        sqlTextUpdate = entityFactory.getSqlTextUpdate();
        sqlTextDelete = entityFactory.getSqlTextDelete();
        sqlTextCount = entityFactory.getSqlTextCount();
    }

    // **************** Facade Methods **************

    /**
     * Поиск сущности по первичному ключу
     * @param id первичный ключ
     * @return найденная сущность
     * @throws SQLException ошибка работы с СУБД
     */
    public E find(Object id) throws SQLException {
        E entity = null;
        try (PreparedStatement pstmt = connection.prepareStatement(sqlTextFindById);) {
            pstmt.setObject(1, id);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    entity = entityFactory.createEntity(rs);
                }
            }
        }
        return entity;
    }

    /**
     * Поиск всех сущностей в СУБД
     * @return список сущностей СУБД
     * @throws SQLException ошибка работы с СУБД
     */
    public List<E> findAll() throws SQLException {
        List<E> result = new ArrayList<>();
        try (Statement stmt = connection.createStatement();) {
            try (ResultSet rs = stmt.executeQuery(sqlTextFindAll);) {
                while (rs.next()) {
                    result.add(entityFactory.createEntity(rs));
                }
            }
        }
        return result;
    }

    /**
     * Добавить сущность в таблицу СУБД
     * @param entity сущность
     * @throws SQLException ошибка работы с СУБД
     */
    public void create(E entity) throws SQLException {
        System.out.println("sql: " + sqlTextInsert);
        try (PreparedStatement pstmt = connection.prepareStatement(sqlTextInsert);) {
            entityFactory.setColumnValueForInsert(entity, pstmt);
            pstmt.executeUpdate();
        }
    }
    
    /**
     * Обновить сущность в СУБД
     * @param entity сущность
     * @throws SQLException ошибка работы с СУБД
     */
    public void update(E entity) throws SQLException {
        System.out.println("sql: " + sqlTextUpdate);
        try (PreparedStatement pstmt = connection.prepareStatement(sqlTextUpdate);) {
            entityFactory.setColumnValueForUpdate(entity, pstmt);
            pstmt.executeUpdate();
        }
    }
    
    /**
     * Удалить сущность из СУБД по первичному ключу 
     * @param id первичный ключ сущности
     * @throws SQLException ошибка работы с СУБД
     */
    public void delete(Object id) throws SQLException {
        System.out.println("sql: " + sqlTextDelete);
        try (PreparedStatement pstmt = connection.prepareStatement(sqlTextDelete);) {
            pstmt.setObject(1, id);
            pstmt.executeUpdate();
        }
    }

    /**
     * Получить кол-во сущностей в СУБД
     * @return кол-во сущностей в СУБД
     * @throws SQLException ошибка работы с СУБД
     */
    public int count() throws SQLException {
        int count = 0;
        try (Statement stmt = connection.createStatement();) {
            try (ResultSet rs = stmt.executeQuery(sqlTextCount);) {
                if (rs.next()) {
                    count = rs.getInt(1);
                }
            }
        }
        return count;
    }

}
