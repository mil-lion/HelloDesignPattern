/*
 * File:    TestState.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.state;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestState {

    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        context.doAction();
        context.doAction();
        context.doAction();
        context.doAction();
    }
}
