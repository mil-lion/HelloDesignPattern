/*
 * File:    Text.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 12:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.templateMethod.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * Фигура Текст
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class Text extends AbstractShape {
    
    // **************** Properties ************************

    public String text;
    public Font font;
    
    // ***************** Constructors *********************
    
    public Text() {
    }
    
    public Text(Color color, int x, int y, String text) {
        super(x, y, color);
        this.text = text;
    }

    public Text(Font font, Color color, int x, int y, String text) {
        super(x, y, color);
        this.text = text;
        this.font = font;
    }
    
    // **************** Cast to String ********************

    @Override
    public String toString() {
        return super.toString()
                + ", text=" + text 
                + '}';
    }

    // ********** Implements of Abstract Method ***********

    private Font oldFont;
    
    @Override
    protected void preDraw(Graphics g) {
        oldFont = g.getFont();
        if (font != null) {
            g.setFont(font);
        }
    }

    @Override
    protected void draw(Graphics g) {
        g.drawString(text, x, y);
    }

    @Override
    protected void postDraw(Graphics g) {
        g.setFont(oldFont);
    }

}
