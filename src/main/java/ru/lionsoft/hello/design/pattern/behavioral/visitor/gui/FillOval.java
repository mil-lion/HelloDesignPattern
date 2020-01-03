/*
 * File:    FillOval.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:56:10
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class FillOval extends Oval {

    public FillOval() {
    }

    public FillOval(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void draw(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
