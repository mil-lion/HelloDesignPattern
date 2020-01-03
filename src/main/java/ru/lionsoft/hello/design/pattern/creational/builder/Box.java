/*
 * File:    Box.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.builder;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Box {

    private String color;

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(String color) {
        this.color = color;
    }

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

}
