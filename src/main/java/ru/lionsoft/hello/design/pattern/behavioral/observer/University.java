/*
 * File:    University.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class University {
    
    private final List<String> students = new ArrayList<>();
    
    // Students 
    public void addStudent(String name) {
        students.add(name);
        notifyObservers();
    }
    
    public void removeStudent(String name) {
        students.remove(name);
        notifyObservers();
    }

    // Observers
    private final List<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.event(students);
        }
    }
}
