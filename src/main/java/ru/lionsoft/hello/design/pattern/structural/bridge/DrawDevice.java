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
 * Bridge - Мостик между Абстрактной фигурой и Устройством для рисования
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public interface DrawDevice {
    
    Color getColor();

    void setColor(Color color);

    void drawLine(int x1, int y1, int x2, int y2);

    void drawString(String str, int x, int y);

    void drawRect(int x, int y, int width, int height);

    void drawOval(int x, int y, int width, int height);

    void fillRect(int x, int y, int width, int height);

    void fillOval(int x, int y, int width, int height);

}
