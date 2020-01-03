/*
 * File:    TestProxy.java
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
public class TestProxy {

    public static void main(String[] args) {
        System.out.println("start");
        Image image = new ProxyImage("test.jpg");
        System.out.println("image created");
        image.display();
        image.display();
    }
}
