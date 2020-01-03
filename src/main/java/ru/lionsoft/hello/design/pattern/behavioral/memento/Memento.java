/*
 * File:    Memento.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:29:24
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.memento;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Memento {
    
    private final String name;
    
    private final int age;

    public Memento(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
}
