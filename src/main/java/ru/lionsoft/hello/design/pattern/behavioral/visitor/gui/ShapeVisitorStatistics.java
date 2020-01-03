/*
 * File:    ShapeVisitorStatistics.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ShapeVisitorStatistics implements ShapeVisitor {

    private int count, cntLine, cntText, cntRect, cntOval, cntFill;
    private double totalSquare;

    private double lineSize(Line line) {
        return Math.hypot(line.x2 - line.x, line.y2 - line.y);
    }

    @Override
    public void visit(Line shape) {
        count++;
        cntLine++;
        totalSquare += lineSize(shape);
    }

    @Override
    public void visit(Text shape) {
        count++;
        cntText++;
    }

    private double rectSquare(Rectangle rect) {
        return rect.width * rect.height;
    }

    private double rectLength(Rectangle rect) {
        return 2 * (rect.width + rect.height);
    }

    @Override
    public void visit(Rectangle shape) {
        count++;
        cntRect++;
        totalSquare += rectLength(shape);
    }

    @Override
    public void visit(FillRectangle shape) {
        count++;
        cntRect++;
        cntFill++;
        totalSquare += rectSquare(shape);
    }

    private double ovalSquare(Oval oval) {
        return Math.PI * oval.width * oval.height / 4;
    }

    private double ovalLength(Oval oval) {
        return Math.PI * (oval.width + oval.height) / 2;
    }

    @Override
    public void visit(Oval shape) {
        count++;
        cntOval++;
        totalSquare += ovalLength(shape);
    }

    @Override
    public void visit(FillOval shape) {
        count++;
        cntOval++;
        cntFill++;
        totalSquare += ovalSquare(shape);
    }

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
    }

}
