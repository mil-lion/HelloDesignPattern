/*
 * File:    RuPorshe.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.abstractFactory.ru;

import ru.lionsoft.hello.design.pattern.creational.abstractFactory.Porshe;

/**
 * Порше для российского рынка
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class RuPorshe implements Porshe {

    @Override
    public long getPorshePrice() {
        return 2000 * 72;
    }

}
