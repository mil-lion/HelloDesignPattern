/*
 * File:    UsAbstractFactoryImpl.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.abstractFactory;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class UsAbstractFactoryImpl implements InterAbstractFactory {

    @Override
    public Lada getLada() {
        return new UsLadaImpl();
    }

    @Override
    public Porshe getPorshe() {
        return new UsPorsheImpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new UsFerrariImpl();
    }

}
