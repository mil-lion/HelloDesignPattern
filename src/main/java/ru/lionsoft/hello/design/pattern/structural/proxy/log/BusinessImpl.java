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
    public void method2() {
        System.out.println("BusinessImpl.method2()");
    }

    @Override
    public void method3() {
        System.out.println("BusinessImpl.method3()");
    }

    @Override
    public void method4() {
        System.out.println("BusinessImpl.method4()");
    }

    @Override
    public int func1(String s) {
        System.out.println("BusinessImpl.func1()");
        return 1;
    }

    @Override
    public int func2(String s) {
        System.out.println("BusinessImpl.func2()");
        return 2;
    }

    @Override
    public int func3(String s) {
        System.out.println("BusinessImpl.func3()");
        return 3;
    }

}
