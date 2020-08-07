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
 * Абстрактная фигура
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public abstract class AbstractShape {
    
    public int x, y;
    public Color color;
    
    public abstract void draw(DrawDevice ctx);

    public AbstractShape() {
    }

    public AbstractShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" 
                + "color=" + color 
                + ", x=" + x 
                + ", y=" + y 
                ;
    }
        
}
