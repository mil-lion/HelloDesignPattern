/*
 * File:    Column.java
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
 * Аннотация полей сущности для мапинга на столбец таблицы
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    
    /**
     * Имя столбца таблицы (по умолчанию название поля класса)
     * @return Имя столбца таблицы 
     */
    String name() default "";
}
