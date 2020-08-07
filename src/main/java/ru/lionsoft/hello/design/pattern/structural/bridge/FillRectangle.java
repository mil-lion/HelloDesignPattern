/*
 * File:    FillRectangle.java
 * Project: HelloDesignPattern
 * Date:    8 авг. 2020 г. 02:19:30
 * Author:  Igor Morenko
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;

/**
 * Фигура Закрашенный прямоугольник
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class FillRectangle extends Rectangle {

    public FillRectangle() {
    }

    public FillRectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void draw(DrawDevice ctx) {
        Color oldColor = ctx.getColor();
        ctx.setColor(color);
        ctx.fillRect(x, y, width, height);
        ctx.setColor(oldColor);
    }
    
}
