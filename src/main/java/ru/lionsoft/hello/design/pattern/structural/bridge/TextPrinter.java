/*
 * File:    TextPrinter.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;

/**
 * Устройство рисования фигур: Текстовый принтер
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class TextPrinter implements DrawDevice {

    public TextPrinter() {
        System.out.println("Initialize Text Printer...");
    }
    
    private Color color;

    private void print(String shape, Object... args) {
        System.out.print("Print: " + shape + " (");
        System.out.print("color=" + color);
        for (Object arg : args) {
            System.out.print("," + arg);
        }
        System.out.println(")");
    }
    
    // ************** Implements interface of DrawDevice ****************
    
    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        print("Line", x1, y1, x2, y2);
    }

    @Override
    public void drawString(String str, int x, int y) {
        print("String", x, y, str);
    }

    @Override
    public void drawRect(int x, int y, int width, int height) {
        print("Rect", x, y, width, height);
    }

    @Override
    public void drawOval(int x, int y, int width, int height) {
        print("Oval", x, y, width, height);
    }
    
    @Override
    public void fillRect(int x, int y, int width, int height) {
        print("FillRect", x, y, width, height);
    }

    @Override
    public void fillOval(int x, int y, int width, int height) {
        print("FillOval", x, y, width, height);
    }
    
}
