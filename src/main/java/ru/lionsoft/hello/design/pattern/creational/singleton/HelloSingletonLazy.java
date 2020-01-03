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
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class HelloSingletonLazy {

    static {
        System.out.println("HelloSingletonLazy loaded!");
    }

    private HelloSingletonLazy() {
    }

    private static HelloSingletonLazy instance = null;

    public static HelloSingletonLazy getInstance() {
        if (instance == null) {
            synchronized (HelloSingletonLazy.class) {
                if (instance == null) {
                    instance = new HelloSingletonLazy();
                }
            }
        }
        return instance;
    }

    // Business Method
    public void hello() {
        System.out.println("Hello from Singleton class!");
    }

    public static void startUp() {
        System.out.println("HelloSingletonLazy.startUp()");
        System.out.println("instance = " + instance);
    }
}
