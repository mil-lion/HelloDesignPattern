/*
 * File:    Engine.java
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
public class Engine implements CarPart {

    @Override
    public void start() {
        System.out.println("Запусаем двигатель");
    }

    @Override
    public void stop() {
        System.out.println("Глушим двигатель");
    }

}
