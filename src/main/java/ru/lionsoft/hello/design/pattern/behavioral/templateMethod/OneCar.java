/*
 * File:    OneCar.java
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
public class OneCar extends Car {

    @Override
    public void startKey() {
        System.out.println("Вставить ключ");
    }

    @Override
    public void stopKey() {
        System.out.println("Вынуть ключ");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

}
