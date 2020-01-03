/*
 * File:    EntityFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.db;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class EntityFactory {

    public static <T> T createEntity(ResultSet rs, Class<T> entityClass) throws SQLException {
        // create instance
        T entity = null;
        try {
            entity = entityClass.getConstructor().newInstance();
            // fill fields
            for (Field field : entityClass.getDeclaredFields()) {
                field.setAccessible(true);
                String columnName = columnNameForProperty(field.getName());
                field.set(entity, rs.getObject(columnName));
            }
        } catch (IllegalAccessException | IllegalArgumentException
                | InstantiationException | InvocationTargetException
                | NoSuchMethodException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        return entity;
    }

    private static String columnNameForProperty(String propertyName) {
        StringBuilder sb = new StringBuilder(propertyName);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isUpperCase(sb.charAt(i))) {
                sb.insert(i++, '_');
            }
        }
        return sb.toString().toUpperCase();
    }
}
