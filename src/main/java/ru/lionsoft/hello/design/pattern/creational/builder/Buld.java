/*
 * File:    Build.java
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
public class Buld {

    private final Builder builder;

    public Buld(int i) {
        builder = i == 1 ? new GasolineBuilderImpl() : new DiselBuilderImpl();
    }

    public Car buildCar() {
        return builder.buildCar();
    }
}
