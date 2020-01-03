/*
 * File:    GasolineBuilderImpl.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.builder;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class GasolineBuilderImpl extends Builder {

    @Override
    public Car buildCar() {
        car.buildBase();
        car.buildWheels();
        car.buildEngine(new GasolineEngine());
        return car;
    }
}
