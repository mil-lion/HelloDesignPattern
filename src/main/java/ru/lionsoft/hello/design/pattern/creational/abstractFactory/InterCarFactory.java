/*
 * File:    InterCarFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.abstractFactory;

/**
 * International Car Factory (Abstract Factory)
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface InterCarFactory {

    Lada getLada();

    Porshe getPorshe();

    Ferrari getFerrari();
}
