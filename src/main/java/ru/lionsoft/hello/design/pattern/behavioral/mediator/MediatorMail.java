/*
 * File:    MediatorMail.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * Конкретный Посредник (Mediator) пересылки сообщений с помощью почты
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class MediatorMail implements Mediator {
    
    @Override
    public void sendMessage(People from, String to, String message) {
        System.out.println("Mediator Send Mail:");
        System.out.println("  From: " + from.getName());
        System.out.println("  To: " + to);
        System.out.println("  Subject: message");
        System.out.println("  Text: " + message);
        // send message to People
        subscriptors.stream()
                .filter(p -> p.getName().equals(to))
                .forEach(p -> p.sendMessage(message));
    }

    // Зарегистрированные подписчики сервиса
    private Set<People> subscriptors = new HashSet<>();
    
    @Override
    public void register(People people) {
        System.out.println("People " + people.getName() + " register into Mail Service.");
        subscriptors.add(people);
    }

    @Override
    public void unregister(People people) {
        System.out.println("People " + people.getName() + " unregister from Mail Service.");
        subscriptors.remove(people);
    }
}
