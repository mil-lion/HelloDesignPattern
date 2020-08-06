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
 * Тестирование Последника (Proxy)
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestProxy {

    public static void main(String[] args) {
        System.out.println("#### Start Test Real Image ####");
        Image image = new RealImage("test.jpg");
        System.out.println("@@@@ image created");
        image.display();
        image.display();

        System.out.println("\n#### Start Test Proxy Image #####");
        image = new ProxyLazyImage("lazy.jpg");
        System.out.println("@@@@ image created");
        image.display();
        image.display();
    }
}
