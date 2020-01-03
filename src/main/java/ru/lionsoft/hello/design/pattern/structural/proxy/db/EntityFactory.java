/*
 * File:    EntityFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy.db;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class EntityFactory {

    /**
     * Создать класс сущности
     *
     * @param <T> тип сущности
     * @param rs выборка из БД
     * @param entityClass интерфейс сущности
     * @return ссылка на новую сущность
     * @throws Exception
     */
    public static <T> T createEntity(ResultSet rs, Class<T> entityClass) throws Exception {

        return (T) Proxy.newProxyInstance(
                entityClass.getClassLoader(),
                new Class[]{entityClass},
                new EntityHandler(entityClass, rs));
    }

    private static class EntityHandler implements InvocationHandler {

        private final Map<String, Object> columns = new HashMap<>();
        private final Class entityClass;

        public EntityHandler(Class entityClass, ResultSet rs) throws SQLException {
            this.entityClass = entityClass;
            System.out.println("create proxy handler for interface: " + entityClass.getSimpleName());

            // Save column to map
            ResultSetMetaData metaData = rs.getMetaData();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                columns.put(metaData.getColumnName(i).toUpperCase(), rs.getObject(i));
            }
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            final String methodName = method.getName();
            if (methodName.equals("toString")) {
                return new StringBuilder(entityClass.getSimpleName())
                        .append("{columns = ")
                        .append(columns.toString())
                        .append("}")
                        .toString();
            } else if (methodName.startsWith("get")) {
                String columnName = columnNameForProperty(methodName.substring(3));
                return columns.get(columnName);
            } else if (methodName.startsWith("set")) {
                String columnName = columnNameForProperty(methodName.substring(3));
                columns.put(columnName, args[0]);
            }
            return null;
        }

        private static String columnNameForProperty(String propertyName) {
            StringBuilder sb = new StringBuilder(propertyName);
            for (int i = 1; i < sb.length(); i++) {
                if (Character.isUpperCase(sb.charAt(i))) {
                    sb.insert(i++, '_');
                }
            }
            return sb.toString().toUpperCase();
        }

    }
}
