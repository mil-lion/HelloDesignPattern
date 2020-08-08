/*
 * File:    Line.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 12:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.templateMethod.gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Фигура Линия
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class Line extends AbstractShape {
    
    // **************** Properties ************************

    public  int x2, y2;

    // ***************** Constructors *********************
    
    public Line() {
    }
    
    public Line(Color color, int x1, int y1, int x2, int y2) {
        super(x1, y1, color);
        this.x2 = x2;
        this.y2 = y2;
    }
    
    // **************** Cast to String ********************

    @Override
    public String toString() {
        return super.toString()
                + ", x2=" + x2 
                + ", y2=" + y2 
                + '}';
    }

    // ********** Implements of Abstract Method ***********

    @Override
    protected void preDraw(Graphics g) {
    }

    @Override
    protected void draw(Graphics g) {
        g.drawLine(x, y, x2, y2);
    }

    @Override
    protected void postDraw(Graphics g) {
    }

}
