/*
 * File:    TestProxy.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy.log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestProxy {

    public static void main(String[] args) {
        System.out.println("#### Not Proxy ####");
        Business business = new BusinessImpl();
        testBusiness(business);

        System.out.println("#### Proxy ####");
        business = new BusinessProxy(new BusinessImpl());
        testBusiness(business);

        System.out.println("#### Dynamic Proxy ####");
        final Business delegate = new BusinessImpl();
        business = (Business) Proxy.newProxyInstance(TestProxy.class.getClassLoader(), // class loader
                new Class[]{Business.class}, // interfaces
                (Object proxy, Method method, Object[] args1) -> { // handler
            System.out.println("Entering " + method.getName() + "...");
            try {
                return method.invoke(delegate, args1);
            } finally {
                System.out.println("Exiting " + method.getName() + "...");
            }
        } 
        );
        testBusiness(business);
    }

    private static void testBusiness(Business business) {
        business.method1();
        business.method2();
        business.method3();
        business.method4();
        System.out.println(business.func1("a"));
        System.out.println(business.func2("b"));
        System.out.println(business.func3("c"));
    }
}
