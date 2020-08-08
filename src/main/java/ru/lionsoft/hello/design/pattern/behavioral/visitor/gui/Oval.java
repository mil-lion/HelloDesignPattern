/*
 * File:    Oval.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:56:10
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;

/**
 * Фигура Овал
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Oval extends AbstractShape {

    // *************** Properties *********************
    
    public int width, height;

    // *************** Constructors *********************

    public Oval() {
    }

    public Oval(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }
     
    // ******************* Visitor **************************

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitOval(this);
    }

}
