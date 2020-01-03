/*
 * File:    HtmlColorWineDecorator.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.decorator;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class HtmlColorWineDecorator extends WineDecorator {

    public HtmlColorWineDecorator(Wine delegate) {
        super(delegate);
    }

    @Override
    public String getColor() {
        final String wineColor = delegate.getColor();
        switch (wineColor) {
            case "red":
                return "<font color='#ff000'>" + wineColor + "</font>";
            case "white":
                return "<font color='#a0a0a0'>" + wineColor + "</font>";
            default:
                return "<font color='#000000'>" + wineColor + "</font>";
        }
    }
}
