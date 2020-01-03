/*
 * File:    CarVisitor.java
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
public class CarVisitor implements Visitor {

    @Override
    public void visit(SportCar car) {
        System.out.println("visit sport car!");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("visit engine!");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("visit whell!");
    }

}
