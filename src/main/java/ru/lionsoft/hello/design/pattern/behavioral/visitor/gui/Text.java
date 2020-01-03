/*
 * File:    Text.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
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
public class Text extends AbstractShape {

    public String text;

    public Text() {
    }

    public Text(Color color, int x, int y, String text) {
        super(color, x, y);
        this.text = text;
    }

    @Override
    public void draw(ShapeVisitor visitor) {
        visitor.visit(this);
    }

}
