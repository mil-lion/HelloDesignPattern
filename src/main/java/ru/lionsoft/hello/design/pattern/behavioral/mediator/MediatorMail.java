/*
 * File:    MediatorMail.java
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
public class MediatorMail implements Mediator {
    
    private Mail mail = new Mail();
    
    @Override
    public void sendMessage(User user, String message) {
        mail.sendEmail(user.getName(), "admin", "test", message);
    }
}
