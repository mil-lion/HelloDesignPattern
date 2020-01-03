/*
 * File:    ShapeVisitorGraphics.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ShapeVisitorGraphics implements ShapeVisitor {

    private final Graphics g;

    public ShapeVisitorGraphics(Graphics g) {
        this.g = g;
    }

    private Color oldColor;
    private Font oldFont;

    private void preDraw() {
        oldColor = g.getColor();
        oldFont = g.getFont();
    }

    private void postDraw() {
        g.setColor(oldColor);
        g.setFont(oldFont);
    }

    @Override
    public void visit(Line shape) {
        preDraw();
        g.setColor(shape.color);
        g.drawLine(shape.x, shape.y, shape.x2, shape.y2);
        postDraw();
    }

    @Override
    public void visit(Text shape) {
        preDraw();
        g.setColor(shape.color);
        g.drawString(shape.text, shape.x, shape.y);
        postDraw();
    }

    @Override
    public void visit(Rectangle shape) {
        preDraw();
        g.setColor(shape.color);
        g.drawRect(shape.x, shape.y, shape.width, shape.height);
        postDraw();
    }

    @Override
    public void visit(FillRectangle shape) {
        preDraw();
        g.setColor(shape.color);
        g.fillRect(shape.x, shape.y, shape.width, shape.height);
        postDraw();
    }

    @Override
    public void visit(Oval shape) {
        preDraw();
        g.setColor(shape.color);
        g.drawOval(shape.x - shape.width / 2, shape.y - shape.height / 2, shape.width, shape.height);
        postDraw();
    }

    @Override
    public void visit(FillOval shape) {
        preDraw();
        g.setColor(shape.color);
        g.fillOval(shape.x - shape.width / 2, shape.y - shape.height / 2, shape.width, shape.height);
        postDraw();
    }
}
