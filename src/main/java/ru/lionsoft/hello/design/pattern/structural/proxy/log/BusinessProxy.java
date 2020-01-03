/*
 * File:    BusinessProxy.java
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
public class BusinessProxy implements Business {

    private final Business delegate;

    public BusinessProxy(Business delegate) {
        this.delegate = delegate;
    }

    @Override
    public void method1() {
        System.out.println("Entering method1()");
        try {
            delegate.method1();
        } finally {
            System.out.println("Exiting method1()");
        }
    }

    @Override
    public void method2() {
        System.out.println("Entering method2()");
        try {
            delegate.method2();
        } finally {
            System.out.println("Exiting method2()");
        }
    }

    @Override
    public void method3() {
        System.out.println("Entering method3()");
        try {
            delegate.method3();
        } finally {
            System.out.println("Exiting method3()");
        }
    }

    @Override
    public void method4() {
        System.out.println("Entering method4()");
        try {
            delegate.method4();
        } finally {
            System.out.println("Exiting method4()");
        }
    }

    @Override
    public int func1(String s) {
        System.out.println("Entering func1()");
        try {
            return delegate.func1(s);
        } finally {
            System.out.println("Exiting func1()");
        }
    }

    @Override
    public int func2(String s) {
        System.out.println("Entering func2()");
        try {
            return delegate.func2(s);
        } finally {
            System.out.println("Exiting func2()");
        }
    }

    @Override
    public int func3(String s) {
        System.out.println("Entering func3()");
        try {
            return delegate.func3(s);
        } finally {
            System.out.println("Exiting func3()");
        }
    }

}
