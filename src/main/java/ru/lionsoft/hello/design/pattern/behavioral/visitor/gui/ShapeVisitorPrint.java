/*
 * File:    ShapeVisitorPrint.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:56:10
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.io.PrintStream;

/**
 * Посетитель фигур (Visitor) для печати фигур на текстовом принтере
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ShapeVisitorPrint implements ShapeVisitor {

    private final PrintStream out;

    public ShapeVisitorPrint(PrintStream out) {
        this.out = out;
        out.println("\nShapes:");
        out.println("-------");
    }

    // *************** Visitor ***********************

    @Override
    public void visitLine(Line shape) {
        out.println("Line{"
                + "color=" + shape.color
                + ", x=" + shape.x
                + ", y=" + shape.y
                + ", x2=" + shape.x2
                + ", y2=" + shape.y2
                + '}');
    }

    @Override
    public void visitText(Text shape) {
        out.println("Text{"
                + "color=" + shape.color
                + ", x=" + shape.x
                + ", y=" + shape.y
                + ", text=" + shape.text
                + '}');
    }

    @Override
    public void visitRect(Rectangle shape) {
        out.println("Rectangle{"
                + "color=" + shape.color
                + ", x=" + shape.x
                + ", y=" + shape.y
                + ", width=" + shape.width
                + ", height=" + shape.height
                + '}');
    }

    @Override
    public void visitFillRect(FillRectangle shape) {
        out.println("FillRectangle{"
                + "color=" + shape.color
                + ", x=" + shape.x
                + ", y=" + shape.y
                + ", width=" + shape.width
                + ", height=" + shape.height
                + '}');
    }

    @Override
    public void visitOval(Oval shape) {
        out.println("Oval{"
                + "color=" + shape.color
                + ", x=" + shape.x
                + ", y=" + shape.y
                + ", width=" + shape.width
                + ", height=" + shape.height
                + '}');
    }

    @Override
    public void visitFillOval(FillOval shape) {
        out.println("FillOval{"
                + "color=" + shape.color
                + ", x=" + shape.x
                + ", y=" + shape.y
                + ", width=" + shape.width
                + ", height=" + shape.height
                + '}');
    }

}
