/*
 * File:    Text.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;
import java.awt.Font;

/**
 * Фигура Текст
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Text extends AbstractShape {

    // *************** Properties *********************
    
    public String text;
    public Font font;

    // *************** Constructors *********************

    public Text() {
    }

    public Text(Color color, int x, int y, String text) {
        super(color, x, y);
        this.text = text;
    }

    public Text(Font font, Color color, int x, int y, String text) {
        super(color, x, y);
        this.text = text;
        this.font = font;
    }

    // ******************* Visitor **************************

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitText(this);
    }

}
