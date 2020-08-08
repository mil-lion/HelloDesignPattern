/*
 * File:    Employee.java
 * Project: HelloDesignPattern
 * Date:    08 авг. 2020 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.mediator;

/**
 * Класс Сотрудник
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Employee implements People {
    
    private final String name;
    private final Mediator mediator;

    public Employee(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.register(this);
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Employee " + name + " receive message: " + message);
    }
    
    /**
     * Послать сообщение другому Пользователю (человеку)
     * @param to кому отправить (получатель)
     * @param message сообщение
     */
    public void sendMessage(String to, String message) {
        mediator.sendMessage(this, to, message);
    }
}
