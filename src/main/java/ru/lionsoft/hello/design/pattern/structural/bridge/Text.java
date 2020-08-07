/*
 * File:    Text.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;

/**
 * Фигура Текст
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class Text extends AbstractShape {
    
    private String text;

    public Text() {
    }
    
    public Text(Color color, int x, int y, String text) {
        super(x, y, color);
        this.text = text;
    }
    
    @Override
    public void draw(DrawDevice ctx) {
        Color oldColor = ctx.getColor();
        ctx.setColor(color);
        ctx.drawString(text, x, y);
        ctx.setColor(oldColor);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", text=" + text 
                + '}';
    }
}
