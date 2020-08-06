/*
 * File:    BusinessProxy.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy.log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Декорирует и прокстирует бизнес интерфейс для журналирования вызова методов
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class BusinessProxyDecorator implements Business {

    private final Business delegate;

    public BusinessProxyDecorator(Business delegate) {
        this.delegate = delegate;
    }

    // **************** Private *******************
    
    private String getTimestamp() {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
                .format(new Date());
    }
    
    private void entering(String methodName) {
        System.out.println(getTimestamp() + " Enetering into " + methodName);
    }
    
    private void exiting(String methodName) {
        System.out.println(getTimestamp() + " Exitting from " + methodName);
    }
    
    // **************** Business Methods *******************
    
    @Override
    public void method1() {
        entering("method1()");
        try {
            delegate.method1();
        } finally {
            exiting("method1()");
        }
    }

    @Override
    public void method2(int x) {
        entering("method2()");
        try {
            delegate.method2(x);
        } finally {
            exiting("method2()");
        }
    }

    @Override
    public void method3(String str) {
        entering("method3()");
        try {
            delegate.method3(str);
        } finally {
            exiting("method3()");
        }
    }

    @Override
    public void method4(int x, String str) {
        entering("method4()");
        try {
            delegate.method4(x, str);
        } finally {
            exiting("method4()");
        }
    }

    @Override
    public int func1(String s) {
        entering("func1()");
        try {
            return delegate.func1(s);
        } finally {
            exiting("func1()");
        }
    }

    @Override
    public String func2(String s) {
        entering("func2()");
        try {
            return delegate.func2(s);
        } finally {
            exiting("func2()");
        }
    }

    @Override
    public int func3(int x) {
        entering("func3()");
        try {
            return delegate.func3(x);
        } finally {
            exiting("func3()");
        }
    }

}
