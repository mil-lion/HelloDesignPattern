/*
 * File:    BoxBuilder.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.builder;

public class BoxBuilder {

    // Свойства для постройки объекта (заявка)
    private int width = 1;
    private int height = 1;
    private int length = 1;
    private String color = "Black";


    /**
     * Задать ширину
     * @param width
     * @return 
     */
    public BoxBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public BoxBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public BoxBuilder setLength(int length) {
        this.length = length;
        return this;
    }

    public BoxBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Построить объект
     * @return 
     */
    public Box createBox() {
        return new Box(width, height, length, color);
    }

}
