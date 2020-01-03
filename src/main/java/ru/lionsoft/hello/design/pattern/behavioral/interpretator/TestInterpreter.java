/*
 * File:    TestInterpreter.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:10:07
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.interpretator;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestInterpreter {
    
    public static void main(String[] args) {
        String str = "TesT";
        Context context = new Context();
        Expression lowerExpression = new LowerExpression(str);
        str = lowerExpression.interpret(context);
        System.out.println(str);
        Expression upperExpression = new UpperExpression(str);
        str = upperExpression.interpret(context);
        System.out.println(str);
    }
}
