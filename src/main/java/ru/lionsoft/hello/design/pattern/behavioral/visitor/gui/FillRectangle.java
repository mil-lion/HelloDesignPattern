/*
 * File:    FillRectangle.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;

/**
 * Фигура Закрашенный прямоугольник
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class FillRectangle extends Rectangle {

    // *************** Constructors *********************

    public FillRectangle() {
    }

    public FillRectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    // ******************* Visitor **************************

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitFillRect(this);
    }
}
