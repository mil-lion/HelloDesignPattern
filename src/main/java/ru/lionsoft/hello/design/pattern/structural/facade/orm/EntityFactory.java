/*
 * File:    EntityFactory.java
 * Project: HelloDesignPattern
 * Date:    08 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.orm;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Map;
import java.util.TreeMap;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Column;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Id;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Table;

/**
 * Фабрика Сущностей (Entity Factory)
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class EntityFactory<E> {
    
    private final Class<E> entityClass;
    private String tableName;
    private String columnIdName; 
    private final Map<String, Field> fieldMaps = new TreeMap<>();
    
    /**
     * Конструктор Фабрики сущностей (Entity Factory)
     * @param entityClass класс сущности
     */
    public EntityFactory(Class<E> entityClass) {
        this.entityClass = entityClass;
        analyzeEntityClass();
    }
    
    /**
     * Метод создания сущности из выборки из БД (ResultSet)
     * @param rs выборка из БД
     * @return созданная сущность
     * @throws SQLException ошибка работы с СУБД 
     */
    public E createEntity(ResultSet rs) throws SQLException {
        try {
            final E entity = entityClass.getConstructor().newInstance();
            // set fields: column_name => field
            for (var entry : fieldMaps.entrySet()) {
                try {
                    final String columnName = entry.getKey();
                    final Field field = entry.getValue();
                    field.set(entity, rs.getObject(columnName));
                } catch (IllegalAccessException | IllegalArgumentException ex) {
                    System.err.println("Error set field value: " + ex.getMessage());
                }
            }
            return entity;
        } catch (IllegalAccessException | IllegalArgumentException 
                | InstantiationException | InvocationTargetException 
                | NoSuchMethodException | SecurityException ex) {
            System.err.println("Error create entity: " + ex.getMessage());
        }
        return null;
    }

    /**
     * Получить имя табоицы сущности
     * @return имя таблицы сущности
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Получить имя столбца первичного ключа сущности
     * @return имя столбца первичного ключа сущности
     */
    public String getColumnIdName() {
        return columnIdName;
    }
        
    /**
     * Получить SQL текст для выборки всех данных из таблицы
     * @return SQL текст выборки всех данных из таблицы
     */
    public String getSqlTextFindAll() {
        return new StringBuilder("SELECT * FROM ")
                .append(tableName)
                .toString();
    }

    /**
     * Получить SQL текст для выборки кол-во данных в таблице
     * @return SQL текст выборки колз-во данных в таблице
     */
    public String getSqlTextCount() {
        return new StringBuilder("SELECT COUNT(*) FROM ")
                .append(tableName)
                .toString();
    }

    /**
     * Получить SQL текст для выборки данных из таблицы по первичному ключу
     * @return SQL текст выборки данных из таблицы по первичному ключу
     */
    public String getSqlTextFindById() {
        return new StringBuilder("SELECT * FROM ")
                .append(tableName)
                .append(" WHERE ")
                .append(columnIdName)
                .append(" = ?")
                .toString();
    }

    /**
     * Получить SQL текст для удаления данных из таблицы
     * @return SQL текст удаления данных из таблицы
     */
    public String getSqlTextDelete() {
        return new StringBuilder("DELETE FROM ")
                .append(tableName)
                .append(" WHERE ")
                .append(columnIdName)
                .append(" = ?")
                .toString();
    }

    /**
     * Получить SQL текст для вставки данных в таблицу
     * @return SQL текст вставки данных в таблицу
     */
    public String getSqlTextInsert() {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(tableName);
        sb.append('(');
        int i = 0;
        for (var columnName : fieldMaps.keySet()) {
            if (i++ > 0) sb.append(',');
            sb.append(columnName);
        }
        sb.append(") VALUES (");
        for (i = 0; i < fieldMaps.size(); i++) {
            sb.append(i > 0 ? ",?" : "?");
        }
        return sb.append(')').toString();
    }
    
    /**
     * Получить SQL текст для обновления данных в таблице
     * @return SQL текст обновления данных в таблице
     */
    public String getSqlTextUpdate() {
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(tableName);
        sb.append(" SET ");
        int i = 0;
        for (var columnName : fieldMaps.keySet()) {
            if (columnName.equalsIgnoreCase(columnIdName)) continue; // skip id column
            if (i++ > 0) sb.append(',');
            sb.append(columnName);
            sb.append("=?");
        }
        return sb.append(" WHERE ")
                .append(columnIdName)
                .append("=?")
                .toString();
    }
    
    /**
     * Установить значения колонок для SQL запросов INSERT
     * @param entity сущность
     * @param pstmt курсор SQL
     * @throws SQLException ошибка СУБД
     */
    public void setColumnValueForInsert(E entity, PreparedStatement pstmt) throws SQLException {
        int i = 1;
        for (Map.Entry<String, Field> entry : fieldMaps.entrySet()) {
            String columnName = entry.getKey();
            Field field = entry.getValue();
            try {
                pstmt.setObject(i++, field.get(entity));
            } catch (IllegalAccessException | IllegalArgumentException ex) {
                System.err.println("Error set column value: " + ex.getMessage());
            }
        }
    }
    
    /**
     * Установить значения колонок для SQL запросов UPDATE
     * @param entity сущность
     * @param pstmt курсор SQL
     * @throws SQLException ошибка СУБД
     */
    public void setColumnValueForUpdate(E entity, PreparedStatement pstmt) throws SQLException {
        int i = 1;
        for (Map.Entry<String, Field> entry : fieldMaps.entrySet()) {
            String columnName = entry.getKey();
            Field field = entry.getValue();
            if (columnName.equalsIgnoreCase(columnIdName)) continue; // skip id column
            try {
                pstmt.setObject(i++, field.get(entity));
            } catch (IllegalAccessException | IllegalArgumentException ex) {
                System.err.println("Error set column value: " + ex.getMessage());
            }
        }
        try {
            pstmt.setObject(i++, fieldMaps.get(columnIdName).get(entity));
        } catch (IllegalAccessException | IllegalArgumentException ex) {
            System.err.println("Error set column value: " + ex.getMessage());
        }
    }
    
    // ************************* Private **************************
    
    /**
     * Анализ класса сущности на аннотации 
     * мапирования на колонки, таблицы и первичного ключа
     */
    private void analyzeEntityClass() {
        // Table Name
        tableName = entityClass.getSimpleName().toUpperCase();
        Table tableAnnotation = entityClass.getAnnotation(Table.class);
        if (tableAnnotation != null) {
            tableName = tableAnnotation.name(); // required
        }
        // Analyze Public Fields - включая иерархию классов
        for (Field field : entityClass.getFields()) { // getDeclaredFields
            String columnName = field.getName().toUpperCase();
            // Check Column
            Column columnAnnotation = field.getAnnotation(Column.class);
            if (columnAnnotation != null) {
                if (!columnAnnotation.name().isEmpty()) {
                    columnName = columnAnnotation.name();
                }
                fieldMaps.put(columnName, field);
            }
            // Check Id
            Id idAnnotation = field.getAnnotation(Id.class);
            if (idAnnotation != null) {
                columnIdName = columnName;
                if (!fieldMaps.containsKey(columnName)) {
                    fieldMaps.put(columnName, field);
                }
            }
        }
//        System.out.println("tableName = " + tableName);
//        System.out.println("columnIdName = " + columnIdName);
//        System.out.println("fieldMaps:");
//        fieldMaps.entrySet().forEach((e) -> System.out.println(e.getKey().getName() + " => " + e.getValue()));
    }
}
