/*
 * File:    Table.java
 * Project: HelloDesignPattern
 * Date:    08 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация задания имени таблицы для сущности (по умолчанию имя класса сущности)
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    
    /**
     * Имя таблицы
     * @return имя таблицы
     */
    String name();
}
