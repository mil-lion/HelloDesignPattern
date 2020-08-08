/*
 * File:    FillRectangle.java
 * Project: HelloDesignPattern
 * Date:    8 авг. 2020 г. 03:30:29
 * Author:  Igor Morenko
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.templateMethod.gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Фигура Закрашенный прямоугольник
 * @author Igor Morenko
 */
public class FillRectangle extends Rectangle {

    // ***************** Constructors *********************
    
    public FillRectangle() {
    }

    public FillRectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }
    
    // ********** Implements of Abstract Method ***********

    @Override
    protected void draw(Graphics g) {
        g.fillRect(x, y, width, height);
    }
}
