/*
 * File:    HelloSingletonLazy.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.singleton;

/**
 * Класс одиночка с ленивой загрузкой и потокобезопасный
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class HelloSingletonLazy {

    static {
        System.out.println("HelloSingletonLazy class loaded!");
    }

    private HelloSingletonLazy() {
        System.out.println("HelloSingletonLazy created!");
    }

    private static HelloSingletonLazy instance = null;

    // Lazy and Thread Safe
    public static HelloSingletonLazy getInstance() {
        if (instance == null) {
            synchronized (HelloSingletonLazy.class) {
                // Double Check
                if (instance == null) {
                    instance = new HelloSingletonLazy();
                }
            }
        }
        return instance;
    }

    // *************** Business Method **********************
    
    public void hello() {
        System.out.println("Hello from Singleton class!");
    }

    public static void startUp() {
        System.out.println("HelloSingletonLazy.startUp()");
        System.out.println("instance = " + instance);
    }
}
