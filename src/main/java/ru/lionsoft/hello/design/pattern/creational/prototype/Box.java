/*
 * File:    Box.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.prototype;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Box implements Cloneable {

    private transient int hash;
    
    public int width;
    public int height;
    public int length;

    public Box() {
    }

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    
    @Override
    public String toString() {
        return "Box{" 
                + "width=" + width 
                + ", height=" + height 
                + ", length=" + length 
                + '}';
    }
    
    @Override
    public Box clone() throws CloneNotSupportedException {
        return (Box) super.clone();
    }
    
}
