/*
 * File:    Facade.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Facade {

    private final CarPart key = new Key();
    private final CarPart engine = new Engine();

    public void startCar() {
        key.start();
        engine.start();
    }

    public void stopCar() {
        engine.stop();
        key.stop();
    }
}
