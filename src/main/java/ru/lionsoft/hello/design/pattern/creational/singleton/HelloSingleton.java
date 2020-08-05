/*
 * File:    HelloSingleton.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.singleton;

/**
 * Класс одиночка
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class HelloSingleton {

    static {
        System.out.println("HelloSingleton class loaded!");
    }

    private HelloSingleton() {
        System.out.println("HelloSingleton creaded!");
    }

    private final static HelloSingleton INSTANCE = new HelloSingleton();

    public static HelloSingleton getInstance() {
        return INSTANCE;
    }

    public static HelloSingleton getHelloSingleton() {
        return INSTANCE;
    }

    // *************** Business Method **********************
    
    public void hello() {
        System.out.println("Hello from Singleton class!");
    }

    public static void startUp() {
        System.out.println("HelloSingleton.startUp()");
        System.out.println("INSTANCE = " + INSTANCE);
    }
}
