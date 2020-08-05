/*
 * File:    UsLada.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.abstractFactory.us;

import ru.lionsoft.hello.design.pattern.creational.abstractFactory.Lada;

/**
 * Лада для американского рынка
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class UsLada implements Lada {

    @Override
    public long getLadaPrice() {
        return 1000;
    }

}
