/*
 * File:    BoxFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.factory;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class BoxFactory {

    public static Box createBox(int width, int height, int length) {
        Box box = new Box();
        box.width = width;
        box.height = height;
        box.length = length;
        return box;
    }

    public static Box createBox(int size) {
        return createBox(size, size, size);
    }

    public static final char TYPE_SIZE_SMALL = 'S';
    public static final char TYPE_SIZE_MEDIUM = 'M';
    public static final char TYPE_SIZE_LARGE = 'L';

    public static Box createBox(char type) {
        switch (type) {
            case 'S':
                return createBox(1, 2, 3);
            case 'M':
                return createBox(4, 5, 6);
            case 'L':
                return createBox(7, 8, 9);
            default:
                return createBox(1);
        }
    }
}
