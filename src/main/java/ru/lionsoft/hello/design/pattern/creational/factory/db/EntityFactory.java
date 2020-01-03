/*
 * File:    EntityFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.factory.db;

import java.lang.reflect.Field;
import java.sql.*;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class EntityFactory {

    public static <T> T createEntity(ResultSet rs, Class<T> entityClass) throws Exception {
        // create instance
        T entity = entityClass.getConstructor().newInstance();
        // fill fields
        for (Field field : entityClass.getDeclaredFields()) {
            field.setAccessible(true);
            String columnName = columnNameForProperty(field.getName());
            field.set(entity, rs.getObject(columnName));
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
