/*
 * File:    NetBeansSingleton.java
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
public class NetBeansSingleton {

    public static final double PI;
    public static final double KURS_DOLLAR;

    static {
        System.out.println("NetBeansSingleton loaded!");
        PI = 3.14159;
        KURS_DOLLAR = 35.5;
    }

    private NetBeansSingleton() {
    }

    public static NetBeansSingleton getInstance() {
        return NetBeansSingletonHolder.INSTANCE;
    }

    private static class NetBeansSingletonHolder {

        static {
            System.out.println("NetBeansSingletonHolder loaded!");
        }

        private static final NetBeansSingleton INSTANCE = new NetBeansSingleton();
    }

    public static void setUp() {
        System.out.println("NetBeansSingleton.setUp()");
    }

    public void hello() {
        System.out.println("Helo from NetBeansSingleton class!");
    }
}
