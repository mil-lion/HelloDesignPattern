/*
 * File:    ShapeVisitor.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface ShapeVisitor {

    void visit(Line shape);

    void visit(Text shape);

    void visit(Rectangle shape);

    void visit(FillRectangle shape);

    void visit(Oval shape);

    void visit(FillOval shape);
}
