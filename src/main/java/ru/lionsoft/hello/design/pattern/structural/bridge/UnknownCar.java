/*
 * File:    UnknownCar.java
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
public class UnknownCar extends Car {

    public UnknownCar(Engine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.print("UnknownCar engine: ");
        engine.setEngine();
    }
}
