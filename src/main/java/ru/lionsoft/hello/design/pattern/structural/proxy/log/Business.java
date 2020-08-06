/*
 * File:    Business.java
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
public interface Business {

    void method1();

    void method2(int x);

    void method3(String str);

    void method4(int x, String str);

    int func1(String s);

    String func2(String s);

    int func3(int x);

}
