/*
 * File:    TestProxy.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy.log;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestProxy {

    public static void main(String[] args) {
        System.out.println("#### Not Proxy ####");
        Business business = new BusinessImpl();
        testBusiness(business);

        System.out.println("\n#### BussinesProxy ####");
        Business business1 = new BusinessProxy();
        testBusiness(business1);

        System.out.println("\n#### BussinesProxyDecorator ####");
        Business business2 = new BusinessProxyDecorator(business);
        testBusiness(business2);

        System.out.println("\n#### Dynamic Proxy ####");
        final Business delegate = business;
        Business business3 = (Business) Proxy.newProxyInstance(
                delegate.getClass().getClassLoader(), // class loader
                new Class[]{Business.class}, // interfaces
                (Object proxy, Method method, Object[] methodArgs) -> { // handler
                    final String methodName = method.getName();
                    System.out.println(getTimestamp() + " Entering " + methodName + "...");
                    try {
                        return method.invoke(delegate, methodArgs);
                    } finally {
                        System.out.println(getTimestamp() + " Exiting " + methodName + "...");
                    }
                });
        testBusiness(business3);
    }

    private static void testBusiness(Business business) {
        business.method1();
        business.method2(10);
        business.method3("Hello");
        business.method4(20, "Proxy");
        System.out.println(business.func1("12345"));
        System.out.println(business.func2("Hello Proxy!"));
        System.out.println(business.func3(123));
    }
    
    private static String getTimestamp() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
                .format(new Date());
    }

}
