/*
 * File:    Flyweight.java
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
public class Flyweight {

    private final int row;

    public Flyweight(int row) {
        this.row = row;
        System.out.println("create for row = " + row);
    }

    public void report(int col) {
        System.out.println(row + ":" + col);
    }
}
