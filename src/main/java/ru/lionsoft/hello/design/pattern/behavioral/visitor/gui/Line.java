/*
 * File:    Line.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:56:10
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;

/**
 * Фигура Линия
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Line extends AbstractShape {

    // *************** Properties *********************
    
    public int x2, y2;

    // *************** Constructors *********************

    public Line() {
    }

    public Line(Color color, int x1, int y1, int x2, int y2) {
        super(color, x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }
     
    // ******************* Visitor **************************

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitLine(this);
    }

}
