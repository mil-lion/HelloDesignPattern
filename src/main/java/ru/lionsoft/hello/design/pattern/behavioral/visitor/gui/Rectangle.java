/*
 * File:    Rectangle.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;

/**
 * Фигура Прямоугольник
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Rectangle extends AbstractShape {

    // *************** Properties *********************
    
    public int width, height;

    // *************** Constructors *********************

    public Rectangle() {
    }

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }
     
    // ******************* Visitor **************************

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitRect(this);
    }

}
