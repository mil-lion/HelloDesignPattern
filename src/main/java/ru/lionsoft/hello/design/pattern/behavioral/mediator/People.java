/*
 * File:    People.java
 * Project: HelloDesignPattern
 * Date:    8 авг. 2020 г. 15:00:07
 * Author:  Igor Morenko
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.mediator;

/**
 * Интерфейс Человек
 * @author Igor Morenko
 */
public interface People {
    
    /**
     * Получить имя человека
     * @return имя человека
     */
    String getName();
    
    /**
     * Отправить сообщение человеку
     * @param message сообщение
     */
    void sendMessage(String message);
    
}
