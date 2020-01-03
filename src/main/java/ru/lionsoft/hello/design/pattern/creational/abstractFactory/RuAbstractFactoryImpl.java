/*
 * File:    RuAbstractFactoryImpl.java
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
public class RuAbstractFactoryImpl implements InterAbstractFactory {

    @Override
    public Lada getLada() {
        return new RuLadaImpl();
    }

    @Override
    public Porshe getPorshe() {
        return new RuPorsheImpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new RuFerrariImpl();
    }

}
