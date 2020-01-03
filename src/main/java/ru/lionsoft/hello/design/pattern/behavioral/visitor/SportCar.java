/*
 * File:    SportCar.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class SportCar implements Car {

    private final Car[] carParts = {new Engine(), new Wheel(), new Wheel(), new Wheel(), new Wheel()};

    @Override
    public void accept(Visitor visitor) {
        for (Car part : carParts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }

}
