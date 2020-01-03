/*
 * File:    TestTemplate.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.templateMethod;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestTemplate {

    public static void main(String[] args) {

        Car one = new OneCar();
        one.start();
        System.out.println("Поехали");
        one.stop();

        System.out.println("####");

        Car two = new TwoCar();
        two.start();
        System.out.println("Поехали");
        two.stop();
    }
}
