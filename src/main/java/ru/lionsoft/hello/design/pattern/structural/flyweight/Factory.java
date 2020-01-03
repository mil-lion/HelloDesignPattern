/*
 * File:    Factory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.flyweight;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Factory {

    private final Flyweight[] pool;

    public Factory(int maxRows) {
        pool = new Flyweight[maxRows];
    }

    public Flyweight getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Flyweight(row);
        }
        return pool[row];
    }
}
