/*
 * File:    BusinessDecoratorImpl.java
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
public class BusinessDecoratorImpl extends BusinessDecorator {

    public BusinessDecoratorImpl(Business delegate) {
        super(delegate);
    }

    @Override
    public int func2(String s) {
        return delegate.func2(s) * 10;
    }
}
