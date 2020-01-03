/*
 * File:    TestFlyweight.java
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
public class TestFlyweight {

    public static void main(String[] args) {

        Integer ii = 1;
        ii = Integer.valueOf(1);
        Byte b = Byte.valueOf((byte) 1);

        String str1 = "Hello World!";
        String str2 = new String(str1);

        int rows = 5;
        Factory factory = new Factory(rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                factory.getFlyweight(i).report(j);
            }
        }
    }
}
