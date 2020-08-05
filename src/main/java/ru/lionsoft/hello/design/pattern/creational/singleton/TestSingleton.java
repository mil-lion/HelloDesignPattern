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

    public static void main(String[] args) throws InterruptedException {

        System.out.println("#### Test HelloSingleton ####");
        HelloSingleton.startUp();
        HelloSingleton helloSingleton1 = HelloSingleton.getInstance();
        helloSingleton1.hello();
        HelloSingleton helloSingleton2 = HelloSingleton.getHelloSingleton();
        System.out.println("helloSingleton1 = " + helloSingleton1);
        System.out.println("helloSingleton2 = " + helloSingleton2);
        System.out.println("helloSingleton1 == helloSingleton2 => " + (helloSingleton1 == helloSingleton2));

        System.out.println("\n#### Test HelloSingletonLazy ####");
        HelloSingletonLazy.startUp();
        // Test MultiThread
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(HelloSingletonLazy.getInstance())).start();
        }
        Thread.sleep(1000);
        HelloSingletonLazy lazySingleton1 = HelloSingletonLazy.getInstance();
        lazySingleton1.hello();
        HelloSingletonLazy.startUp();
        HelloSingletonLazy lazySingleton2 = HelloSingletonLazy.getInstance();
        System.out.println("lazySingleton1 = " + lazySingleton1);
        System.out.println("lazySingleton2 = " + lazySingleton2);
        System.out.println("lazySingleton1 == lazySingleton2 => " + (lazySingleton1 == lazySingleton2));

        System.out.println("\n#### Test NetBeansSingleton ####");
        NetBeansSingleton.startUp();
        // Test MultiThread
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(NetBeansSingleton.getInstance())).start();
        }
        Thread.sleep(1000);
        NetBeansSingleton nbSingleton1 = NetBeansSingleton.getInstance();
        nbSingleton1.hello();
        NetBeansSingleton nbSingleton2 = NetBeansSingleton.getInstance();
        System.out.println("nbSingleton1 = " + nbSingleton1);
        System.out.println("nbSingleton2 = " + nbSingleton2);
        System.out.println("nbSingleton1 == nbSingleton2 => " + (nbSingleton1 == nbSingleton2));
    }
}
