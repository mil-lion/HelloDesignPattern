/*
 * File:    GraphicsAdapter.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Адаптер графического контекста GUI к устройству рисования
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class GraphicsAdapter implements DrawDevice {
    
    private final Graphics g;

    public GraphicsAdapter(Graphics gc) {
        this.g = gc;
    }
    
    // ************** Adapted Methods ***************

    @Override
    public Color getColor() {
        return g.getColor();
    }

    @Override
    public void setColor(Color color) {
        g.setColor(color);
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void drawString(String str, int x, int y) {
        g.drawString(str, x, y);
    }

    @Override
    public void drawRect(int x, int y, int width, int height) {
        g.drawRect(x, y, width, height);
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        g.drawOval(x, y, width, height);
    }
    
    @Override
    public void fillRect(int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }

    @Override
    public void fillOval(int x, int y, int width, int height) {
        g.fillOval(x, y, width, height);
    }
    
}
