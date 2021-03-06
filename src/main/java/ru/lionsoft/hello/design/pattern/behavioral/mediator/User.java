/*
 * File:    User.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.mediator;

/**
 * Класс Пользователь
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class User implements People {
    
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void sendMessage(String message) {
        System.out.println("User " + name + " receive message: " + message);
    }
    
    /**
     * Послать сообщение другому Пользователю (человеку)
     * @param to кому отправить (получатель)
     * @param message сообщение
     */
    public void sendMessage(People to, String message) {
        to.sendMessage(message);
    }
}
