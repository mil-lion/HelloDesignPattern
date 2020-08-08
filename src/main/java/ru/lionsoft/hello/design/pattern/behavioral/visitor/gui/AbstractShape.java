/*
 * File:    AbstractShape.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:56:10
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;

/**
 * Абстрактная фигура
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public abstract class AbstractShape {

    // *************** Properties *********************
    
    public Color color;
    public int x, y;

    // *************** Constructors *********************

    public AbstractShape() {
    }

    public AbstractShape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // ******************* Visitor **************************
    
    /**
     * Метод обработки объекта через Посетителя (Visitor)
     * @param visitor Посетитель (Visitor)
     */
    public abstract void accept(ShapeVisitor visitor);

}
