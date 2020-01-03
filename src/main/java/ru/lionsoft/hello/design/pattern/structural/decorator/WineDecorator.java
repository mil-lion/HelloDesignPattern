/*
 * File:    WineDecorator.java
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
public abstract class WineDecorator implements Wine {

    protected Wine delegate;

    public WineDecorator(Wine delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getColor() {
        return delegate.getColor();
    }

    @Override
    public String getName() {
        return delegate.getName();
    }

}
