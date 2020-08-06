/*
 * File:    GenericDecorator.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.decorator.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class GenericDecorator {

    /**
     *
     * @param <I> interface class
     * @param <T> delegate object
     * @param <D> decorator class
     * @param interfaceClass
     * @param delegate
     * @param decoratorClass
     * @return
     */
    public static <I, T extends I, D extends I> I createDecorator(
            Class<I> interfaceClass,
            T delegate,
            Class<D> decoratorClass) throws Exception {
        return (I) Proxy.newProxyInstance(
                interfaceClass.getClassLoader(),
                new Class[]{interfaceClass},
                new DecoratorHandler(delegate, decoratorClass, interfaceClass));
    }

    private static class DecoratorHandler implements InvocationHandler {

        private final Object delegate;
        private final Object decorator;
        private final Map<String, Method> decorMethods = new HashMap<>();

        public DecoratorHandler(Object delegate, Class decoratorClass, Class interfaceClass) throws Exception {
            this.delegate = delegate;
            // create decorator
            decorator = decoratorClass
                    .getConstructor(interfaceClass)
                    .newInstance(delegate);

            // get decor methods
            for (Method method : decoratorClass.getDeclaredMethods()) {
                decorMethods.put(method.getName(), method);
            }
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            final String methodName = method.getName();
            if (decorMethods.containsKey(methodName)) {
                // decorate
                return decorMethods.get(methodName).invoke(decorator, args);
            } else {
                // run method delegate
                return method.invoke(delegate, args);
            }
        }

    }
}
