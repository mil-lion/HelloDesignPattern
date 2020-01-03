/*
 * File:    User.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:30:23
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.memento;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class User {
    
    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    private int age;

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.printf("create: name = %s, age = %d\n", name, age);
    }

    public Memento save() {
        System.out.printf("save: name = %s, age = %d\n", name, age);
        return new Memento(name, age);
    }
    
    public void restore(Memento memento) {
        name = memento.getName();
        age = memento.getAge();
        System.out.printf("restore: name = %s, age = %d\n", name, age);
    }
}
