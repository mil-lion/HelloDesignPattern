/*
 * File:    TestMediator.java
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
public class TestMediator {
    
    public static void main(String[] args) {
        Mediator mediator = new MediatorMail();
        User user1 = new User("user1", mediator);
        User user2 = new User("user2", mediator);
        user1.sendMessage("message1");
        user2.sendMessage("message2");
    }
}
