/*
 * File:    Line.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;

/**
 * Фигура Линия
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class Line extends AbstractShape {
    
    public int x2, y2;

    public Line() {
    }
    
    public Line(Color color, int x1, int y1, int x2, int y2) {
        super(x1, y1, color);
        this.x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void draw(DrawDevice ctx) {
        Color oldColor = ctx.getColor();
        ctx.setColor(color);
        ctx.drawLine(x, y, x2, y2);
        ctx.setColor(oldColor);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", x2=" + x2 
                + ", y2=" + y2 
                + '}';
    }
}
