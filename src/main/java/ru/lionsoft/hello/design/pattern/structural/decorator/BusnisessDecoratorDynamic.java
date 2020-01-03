/*
 * File:    BusnisessDecoratorDynamic.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.decorator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class BusnisessDecoratorDynamic {

    public static Business createDecorator(Business delegate) {
        return (Business) Proxy.newProxyInstance(
                Business.class.getClassLoader(),
                new Class[]{Business.class},
                new DecoratorHandler(delegate));
    }

    private static class DecoratorHandler implements InvocationHandler {

        private final Business delegate;

        public DecoratorHandler(Business delegate) {
            this.delegate = delegate;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().equals("func2")) {
                return delegate.func2((String) args[0]) * 10;
            } else {
                return method.invoke(delegate, args);
            }
        }

    }
}
