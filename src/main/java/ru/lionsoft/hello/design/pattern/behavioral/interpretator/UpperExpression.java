/*
 * File:    UpperExpression.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:08:20
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.interpretator;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class UpperExpression implements Expression {

    private final String str;

    public UpperExpression(String str) {
        this.str = str;
    }
    
    @Override
    public String interpret(Context context) {
        return context.getUpperCase(str);
    }
    
}
