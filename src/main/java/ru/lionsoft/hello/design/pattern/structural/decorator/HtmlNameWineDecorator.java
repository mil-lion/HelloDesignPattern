/*
 * File:    HtmlNameWineDecorator.java
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
public class HtmlNameWineDecorator extends WineDecorator {

    public HtmlNameWineDecorator(Wine delegate) {
        super(delegate);
    }

    @Override
    public String getName() {
        final String wineColor = delegate.getColor();
        final String wineName = delegate.getName();
        switch (wineColor) {
            case "red":
                return "<font color='#ff000'>" + wineName + "</font>";
            case "white":
                return "<font color='#a0a0a0'>" + wineName + "</font>";
            default:
                return "<font color='#000000'>" + wineName + "</font>";
        }
    }
}
