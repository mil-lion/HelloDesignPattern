/*
 * File:    TestAbstractFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.abstractFactory;

import ru.lionsoft.hello.design.pattern.creational.abstractFactory.ru.RuCarFactory;
import ru.lionsoft.hello.design.pattern.creational.abstractFactory.us.UsCarFactory;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        String country = Math.random() < 0.5 ? "RU" : "US";
        
        // Abstract Factory
        InterCarFactory carFactory = getCarFactory(country);

        // Get Car
        Lada lada = carFactory.getLada();
        Porshe porshe = carFactory.getPorshe();
        Ferrari ferrari = carFactory.getFerrari();

        // Print
        System.out.println("Country: " + country);
        System.out.println("Lada Price: " + lada.getLadaPrice());
        System.out.println("Porshe Price: " + porshe.getPorshePrice());
        System.out.println("Ferrari Price: " + ferrari.getFerrariPrice());
    }
    
    // Factory Method
    public static InterCarFactory getCarFactory(String country) {
        switch (country) {
            case "US":
                return new UsCarFactory();
            case "RU":
                return new RuCarFactory();
            default:
                throw new IllegalArgumentException("Not found car factory into country: " + country);
        }
    }
}
