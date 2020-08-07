/*
 * File:    FillOval.java
 * Project: HelloDesignPattern
 * Date:    8 авг. 2020 г. 02:20:59
 * Author:  Igor Morenko
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;

/**
 * Фигура Закрашенный овал
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class FillOval extends Oval {

    public FillOval() {
    }

    public FillOval(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void draw(DrawDevice ctx) {
        Color oldColor = ctx.getColor();
        ctx.setColor(color);
        ctx.fillOval(x - width / 2, y - height / 2, width, height);
        ctx.setColor(oldColor);
    }
    
}
