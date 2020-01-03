/*
 * File:    TestSingleton.java
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
public class TestSingleton {

    public static void main(String[] args) {

//        HelloSingleton helloSingleton = HelloSingleton.getInstance();
//        helloSingleton.hello();
        HelloSingleton.startUp();

        HelloSingletonLazy.startUp();
        HelloSingletonLazy lazy = HelloSingletonLazy.getInstance();
        lazy.hello();
        HelloSingletonLazy.startUp();

        NetBeansSingleton.setUp();
        NetBeansSingleton singleton = NetBeansSingleton.getInstance();
        singleton.hello();
    }
}
