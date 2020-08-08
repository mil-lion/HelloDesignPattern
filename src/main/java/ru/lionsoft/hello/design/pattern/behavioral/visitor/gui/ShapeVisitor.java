/*
 * File:    ShapeVisitor.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

/**
 * Интерфейс Посетителя фигур (Visitor)
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface ShapeVisitor {

    void visitLine(Line shape);

    void visitText(Text shape);

    void visitRect(Rectangle shape);

    void visitFillRect(FillRectangle shape);

    void visitOval(Oval shape);

    void visitFillOval(FillOval shape);
}
