/*
 * File:    FillOval.java
 * Project: HelloDesignPattern
 * Date:    8 авг. 2020 г. 03:29:41
 * Author:  Igor Morenko
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.templateMethod.gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Фигура Закрашенный овал
 * @author Igor Morenko
 */
public class FillOval extends Oval {

    // ***************** Constructors *********************
    
    public FillOval() {
    }

    public FillOval(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }
    
    // ********** Implements of Abstract Method ***********

    @Override
    protected void draw(Graphics g) {
        g.fillOval(x - width / 2, y - height / 2, width, height);
    }
    
    
}
