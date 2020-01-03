/*
 * File:    TestAbstractFactory.java
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
public class TestAbstractFactory {

    public static void main(String[] args) {
        String country = "RU";
        InterAbstractFactory iFactory = null;
        switch (country) {
            case "US":
                iFactory = new UsAbstractFactoryImpl();
                break;
            case "RU":
                iFactory = new RuAbstractFactoryImpl();
                break;
            default:
                throw new IllegalArgumentException("Unknoun country: " + country);
        }
        Lada lada = iFactory.getLada();
        System.out.println("Lada Price: " + lada.getLadaPrice());

        Ferrari ferrari = iFactory.getFerrari();
        System.out.println("Ferrari Price: " + ferrari.getFerrariPrice());
    }
}
