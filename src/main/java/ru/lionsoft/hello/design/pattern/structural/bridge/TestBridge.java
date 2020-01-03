/*
 * File:    TestBridge.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestBridge {

    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println("####");
        Car unknownCar = new UnknownCar(new UnknownEngine());
        unknownCar.setEngine();
    }
}
