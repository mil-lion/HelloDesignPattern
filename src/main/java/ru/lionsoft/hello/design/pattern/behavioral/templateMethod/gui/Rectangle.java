/*
 * File:    Rectangle.java
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
 * Фигура Прямоугольник
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class Rectangle extends AbstractShape {
    
    // **************** Properties ************************

    public int width, height;

    // ***************** Constructors *********************
    
    public Rectangle() {
    }
    
    public Rectangle(Color color, int x, int y, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    
    // **************** Cast to String ********************

    @Override
    public String toString() {
        return super.toString()
                + ", width=" + width 
                + ", height=" + height 
                + '}';
    }

    // ********** Implements of Abstract Method ***********

    @Override
    protected void preDraw(Graphics g) {
    }

    @Override
    protected void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    protected void postDraw(Graphics g) {
    }

}
