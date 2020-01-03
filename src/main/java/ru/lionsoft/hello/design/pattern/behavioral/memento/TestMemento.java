/*
 * File:    TestMemento.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:41:02
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.memento;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestMemento {
    
    
    public static void main(String[] args) {
        SaveUser saveUser = new SaveUser();
        User user1 = new User("Peter", 17);
        User user2 = new User("Ivan", 19);
        saveUser.add(user1.save());
        user1.setAge(25);
        user1.setName("Петр");
        saveUser.add(user1.save());
        user1.restore(saveUser.get(0));
    }
}
