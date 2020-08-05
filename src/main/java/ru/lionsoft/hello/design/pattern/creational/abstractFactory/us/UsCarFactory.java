/*
 * File:    UsCarFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.abstractFactory.us;

import ru.lionsoft.hello.design.pattern.creational.abstractFactory.Ferrari;
import ru.lionsoft.hello.design.pattern.creational.abstractFactory.InterCarFactory;
import ru.lionsoft.hello.design.pattern.creational.abstractFactory.Lada;
import ru.lionsoft.hello.design.pattern.creational.abstractFactory.Porshe;

/**
 * Америаканций завод автомобилей
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class UsCarFactory implements InterCarFactory {

    @Override
    public Lada getLada() {
        return new UsLada();
    }

    @Override
    public Porshe getPorshe() {
        return new UsPorshe();
    }

    @Override
    public Ferrari getFerrari() {
        return new UsFerrari();
    }

}
