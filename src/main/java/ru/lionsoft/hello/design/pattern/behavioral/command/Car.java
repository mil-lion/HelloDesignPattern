/*
 * File:    Car.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.command;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Car {
    
    public void startEngine() {
        System.out.println("Запустить двигатель");
    }
    
    public void stopEngine() {
        System.out.println("Заглушить двигатель");
    }
    
    public void startKey() {
        System.out.println("Вставить ключ");
    }
    
    public void stopKey() {
        System.out.println("Извлечь ключ");
    }
    
}
