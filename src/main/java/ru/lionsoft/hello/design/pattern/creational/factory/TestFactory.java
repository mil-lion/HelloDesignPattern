/*
 * File:    TestFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.factory;

import java.util.Random;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestFactory {

    public static void main(String[] args) {
        String[] osNames = {"windows", "linux", "mac"};
        
        Factory factory = new Factory();
        
        OS randomOS = factory.getOS(osNames[new Random().nextInt(osNames.length)]);
        randomOS.useFunctionOS();
        
        OS userOS = factory.getUserOS();
        userOS.useFunctionOS();

        OS currentOS = factory.getCurrentOS();
        currentOS.useFunctionOS();

        Box b1 = BoxFactory.createBox(1, 2, 3);
        Box b2 = BoxFactory.createBox(10);
        Box b3 = BoxFactory.createBox(BoxFactory.TYPE_SIZE_MEDIUM);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
}
