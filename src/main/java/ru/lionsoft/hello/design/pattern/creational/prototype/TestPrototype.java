/*
 * File:    TestPrototype.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.prototype;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        ComplicatedObject one = new ComplicatedObject();
        one.setType(ComplicatedObject.Type.ONE);

        ComplicatedObject two = one.copy();

        System.out.println("one: " + one);
        System.out.println("two: " + two);
        System.out.println("one.type: " + one.getType());
        System.out.println("two.type: " + two.getType());

        Box b1 = new Box(1, 2, 3);
        Box b2 = (Box) b1.clone();
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b1.hash = " + Integer.toHexString(b1.hashCode()));
        System.out.println("b2.hash = " + Integer.toHexString(b2.hashCode()));
    }
}
