/*
 * File:    Mediator.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.mediator;

/**
 * Посредник (Mediator) пересылки сообщений
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface Mediator {
    
    /**
     * Послать сообщение Человеку
     * @param from от кого (отправитель)
     * @param to кому (получатель)
     * @param message сообщение
     */
    void sendMessage(People from, String to, String message);
    
    /**
     * Зарегистрировать Человека
     * @param people человек подписчик
     */
    void register(People people);
    
    /**
     * Снять с регистрации Человека
     * @param people человек подписчик
     */
    void unregister(People people);
}
