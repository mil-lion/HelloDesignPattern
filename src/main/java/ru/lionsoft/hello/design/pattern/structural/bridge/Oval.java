/*
 * File:    Oval.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;

/**
 * Фигура Овал
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class Oval extends AbstractShape {
    
    public int width, height;

    public Oval() {
    }
    
    public Oval(Color color, int x, int y, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw(DrawDevice ctx) {
        Color oldColor = ctx.getColor();
        ctx.setColor(color);
        ctx.drawOval(x - width / 2, y - height / 2, width, height);
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
