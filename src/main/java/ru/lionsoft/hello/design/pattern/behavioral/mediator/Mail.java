/*
 * File:    Mail.java
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
public class Mail {
    
    public void sendEmail(String from, String to, String subject, String text) {
        System.out.println("Send Email:");
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Subject: " + subject);
        System.out.println(text);
    }
    
}
