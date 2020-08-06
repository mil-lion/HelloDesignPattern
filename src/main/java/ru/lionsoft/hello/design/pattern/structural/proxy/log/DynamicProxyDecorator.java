/*
 * File:    DynamicProxyDecorator.java
 * Project: HelloDesignPattern
 * Date:    7 авг. 2020 г. 00:00:37
 * Author:  Igor Morenko
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy.log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Igor Morenko
 */
public class DynamicProxyDecorator implements InvocationHandler {
    
    // **************** Constructor ******************
    
    public static <I> I newDynamicProxyDecorator(Class<I> interfaceClass, I delegate) {
        return (I) Proxy.newProxyInstance(
                delegate.getClass().getClassLoader(), // class loader
                new Class[]{interfaceClass}, // interfaces
                new DynamicProxyDecorator(delegate)); // handler
    }

    private final Object delegate;
    
    private DynamicProxyDecorator(Object delegate) {
        this.delegate = delegate;
    }
    
    // **************** Private ******************

    private String getTimestamp() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
                .format(new Date());
    }
    
    private void entering(String methodName) {
        System.out.println(getTimestamp() + " Enetering into " + methodName + "...");
    }
    
    private void exiting(String methodName) {
        System.out.println(getTimestamp() + " Exitting from " + methodName + "...");
    }

    // **************** Implements of onterface InvocationHandler ******************

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        final String methodName = method.getName();
        entering(methodName);
        long startTime = System.currentTimeMillis();
        try {
            return method.invoke(delegate, args);
        } finally {
            long stopTime = System.currentTimeMillis();
            exiting(methodName);
            System.out.println("duration: " + (stopTime - startTime) + " ms");
        }
    }
}
