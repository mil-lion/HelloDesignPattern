/*
 * File:    BusinessImpl.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy.log;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class BusinessImpl implements Business {

    @Override
    public void method1() {
        System.out.println("BusinessImpl.method1()");
    }

    @Override
    public void method2(int x) {
        System.out.println("BusinessImpl.method2(" + x + ")");
    }

    @Override
    public void method3(String str) {
        System.out.println("BusinessImpl.method3('"+ str + "')");
    }

    @Override
    public void method4(int x, String str) {
        System.out.println("BusinessImpl.method4(" + x + ",'" + str + "')");
    }

    @Override
    public int func1(String s) {
        System.out.println("BusinessImpl.func1('" + s + "')");
        return Integer.parseInt(s);
    }

    @Override
    public String func2(String s) {
        System.out.println("BusinessImpl.func2('" + s + "')");
        return s.toUpperCase();
    }

    @Override
    public int func3(int x) {
        System.out.println("BusinessImpl.func3(" + x + ")");
        return x + (int)(Math.random() * 200 - 100);
    }

}
