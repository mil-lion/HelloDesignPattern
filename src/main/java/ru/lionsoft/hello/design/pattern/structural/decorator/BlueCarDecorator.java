/*
 * File:    BlueCarDecorator.java
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
public class BlueCarDecorator extends CarDecorator {

    public BlueCarDecorator(Car delegate) {
        super(delegate);
    }

    @Override
    public void draw() {
        delegate.draw();
        setColor();
    }

    public void setColor() {
        System.out.println("Color: red");
    }
}
