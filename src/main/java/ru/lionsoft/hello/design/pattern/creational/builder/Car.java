/*
 * File:    Car.java
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
public class Car {

    public void buildBase() {
        print("Делаем корпус");
    }

    public void buildWheels() {
        print("Ставим колеса");
    }

    public void buildEngine(Engine engine) {
        print("Ставим двигатель: " + engine.getEngineType());
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
