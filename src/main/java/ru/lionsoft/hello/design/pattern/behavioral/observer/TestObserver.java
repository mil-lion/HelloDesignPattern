/*
 * File:    TestObserver.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.observer;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestObserver {
    
    public static void main(String[] args) {
        University university = new University();
        university.addStudent("Vaska");
        
        Director director = new Director();
        Facultet facultet = new Facultet();
        
        university.addObserver(director);
        university.addObserver(facultet);
        
        university.addStudent("Anna");
        
        university.removeObserver(director);
        
        university.removeStudent("Vaska");
        
    }
}
