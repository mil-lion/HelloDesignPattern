/*
 * File:    TestMediator.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.mediator;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestMediator {
    
    public static void main(String[] args) {

        System.out.println("#### Test without Mediator ####");
        User user1 = new User("Scott");
        User user2 = new User("Igor");
        User user3 = new User("King");

        user1.sendMessage(user2, "Hello User2 from User1!");
        user1.sendMessage(user3, "Hello User3 from User1!");
        user3.sendMessage(user2, "Hi User2 from User3!");

        System.out.println("\n#### Test with Mediator ####");
        Mediator mediator = new MediatorMail();
        Employee emp1 = new Employee("Scott", mediator);
        Employee emp2 = new Employee("Igor", mediator);
        Employee emp3 = new Employee("King", mediator);

        emp1.sendMessage("Igor", "Hello Igor from Scott!");
        emp1.sendMessage("King", "Hello King from Scott!");
        emp3.sendMessage("Igor", "Hi Igor from King!");
    }
}
