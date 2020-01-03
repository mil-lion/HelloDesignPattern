/*
 * File:    Car.java
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
public abstract class Car {

    public abstract void startKey();

    public abstract void stopKey();

    public abstract void startEngine();

    public abstract void stopEngine();

    public final void start() {
        startKey();
        startEngine();
    }

    public final void stop() {
        stopEngine();
        stopKey();
    }
}
