/*
 * File:    ShapeVisitorStatistics.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 * Посетитель фигур (Visitor) для рассчета статистики по фигурам
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ShapeVisitorStatistics implements ShapeVisitor {

    // *************** Private ***********************

    private int count, cntLine, cntText, cntRect, cntOval, cntFill;
    private double totalSquare;
    private final Set<Color> colors = new HashSet<>();

    private void defaultShape(AbstractShape shape) {
        count++;
        colors.add(shape.color);
    }
    
    private double lineSize(Line line) {
        return Math.hypot(line.x2 - line.x, line.y2 - line.y);
    }

    private double rectSquare(Rectangle rect) {
        return rect.width * rect.height;
    }

    private double rectLength(Rectangle rect) {
        return 2 * (rect.width + rect.height);
    }

    private double ovalSquare(Oval oval) {
        return Math.PI * oval.width * oval.height / 4;
    }

    private double ovalLength(Oval oval) {
        return Math.PI * (oval.width + oval.height) / 2;
    }

    // *************** Public ***********************

    public void report() {
        System.out.println("\nReport:");
        System.out.println("-------");
        System.out.println("count: " + count);
        System.out.println("cntLine: " + cntLine);
        System.out.println("cntText: " + cntText);
        System.out.println("cntRect: " + cntRect);
        System.out.println("cntOval: " + cntOval);
        System.out.println("cntFill: " + cntFill);
        System.out.println("totalSquare: " + totalSquare);
        System.out.println("color size: " + colors.size());
    }

    // *************** Visitor ***********************

    @Override
    public void visitLine(Line shape) {
        defaultShape(shape);
        cntLine++;
        totalSquare += lineSize(shape);
    }

    @Override
    public void visitText(Text shape) {
        defaultShape(shape);
        cntText++;
    }

    @Override
    public void visitRect(Rectangle shape) {
        defaultShape(shape);
        cntRect++;
        totalSquare += rectLength(shape);
    }

    @Override
    public void visitFillRect(FillRectangle shape) {
        defaultShape(shape);
        cntRect++;
        cntFill++;
        totalSquare += rectSquare(shape);
    }

    @Override
    public void visitOval(Oval shape) {
        defaultShape(shape);
        cntOval++;
        totalSquare += ovalLength(shape);
    }

    @Override
    public void visitFillOval(FillOval shape) {
        defaultShape(shape);
        cntOval++;
        cntFill++;
        totalSquare += ovalSquare(shape);
    }

}
