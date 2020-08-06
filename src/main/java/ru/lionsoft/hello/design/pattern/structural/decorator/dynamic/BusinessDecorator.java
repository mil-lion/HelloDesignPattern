/*
 * File:    BusinessDecorator.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.decorator.dynamic;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public abstract class BusinessDecorator implements Business {

    protected final Business delegate;

    public BusinessDecorator(Business delegate) {
        this.delegate = delegate;
    }

    @Override
    public void method1() {
        delegate.method1();
    }

    @Override
    public void method2() {
        delegate.method2();
    }

    @Override
    public void method3() {
        delegate.method3();
    }

    @Override
    public void method4() {
        delegate.method4();
    }

    @Override
    public int func1(String s) {
        return delegate.func1(s);
    }

    @Override
    public int func2(String s) {
        return delegate.func2(s);
    }

    @Override
    public int func3(String s) {
        return delegate.func3(s);
    }
}
