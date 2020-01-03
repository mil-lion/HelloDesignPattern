/*
 * File:    ProxyImage.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ProxyImage implements Image {

    private final String file;
    private RealImage delegate;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (delegate == null) {
            delegate = new RealImage(file);
        }
        delegate.display();
    }

}
