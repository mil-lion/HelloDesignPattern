/*
 * File:    ShapeVisitorGraphics.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * Посетитель фигур (Visitor) для отрисовки фигур на экране
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ShapeVisitorGraphics implements ShapeVisitor {

    private final Graphics g;

    public ShapeVisitorGraphics(Graphics g) {
        this.g = g;
    }

    // *************** Private ***********************
    
    private Color oldColor;
    private Font oldFont;

    private void preDraw(Color color, Font font) {
        oldColor = g.getColor();
        if (color != null) g.setColor(color);
        oldFont = g.getFont();
        if (font != null) g.setFont(font);
    }

    private void postDraw() {
        g.setColor(oldColor);
        g.setFont(oldFont);
    }

    // *************** Visitor ***********************

    @Override
    public void visitLine(Line shape) {
        preDraw(shape.color, null);
        g.drawLine(shape.x, shape.y, shape.x2, shape.y2);
        postDraw();
    }

    @Override
    public void visitText(Text shape) {
        preDraw(shape.color, shape.font);
        g.drawString(shape.text, shape.x, shape.y);
        postDraw();
    }

    @Override
    public void visitRect(Rectangle shape) {
        preDraw(shape.color, null);
        g.drawRect(shape.x, shape.y, shape.width, shape.height);
        postDraw();
    }

    @Override
    public void visitFillRect(FillRectangle shape) {
        preDraw(shape.color, null);
        g.fillRect(shape.x, shape.y, shape.width, shape.height);
        postDraw();
    }

    @Override
    public void visitOval(Oval shape) {
        preDraw(shape.color, null);
        g.drawOval(shape.x - shape.width / 2, shape.y - shape.height / 2, shape.width, shape.height);
        postDraw();
    }

    @Override
    public void visitFillOval(FillOval shape) {
        preDraw(shape.color, null);
        g.fillOval(shape.x - shape.width / 2, shape.y - shape.height / 2, shape.width, shape.height);
        postDraw();
    }
}
