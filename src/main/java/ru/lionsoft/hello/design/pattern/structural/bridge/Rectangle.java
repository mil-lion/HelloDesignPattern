/*
 * File:    Rectangle.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;

/**
 * Фигура Прямоугольник
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class Rectangle extends AbstractShape {
    
    public int width, height;

    public Rectangle() {
    }
    
    public Rectangle(Color color, int x, int y, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw(DrawDevice ctx) {
        Color oldColor = ctx.getColor();
        ctx.setColor(color);
        ctx.drawRect(x, y, width, height);
        ctx.setColor(oldColor);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", width=" + width 
                + ", height=" + height 
                + '}';
    }
}
