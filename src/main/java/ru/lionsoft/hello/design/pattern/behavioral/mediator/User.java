/*
 * File:    User.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.mediator;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class User {
    
    private final String name;
    private final Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }
    
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }
}
