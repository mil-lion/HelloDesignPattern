/*
 * File:    ProxyLazyImage.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy;

/**
 * Делает ленивую загрузку изображения (по первому требованию)
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ProxyLazyImage implements Image {

    private final String file;
    private RealImage delegate;

    public ProxyLazyImage(String file) {
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
