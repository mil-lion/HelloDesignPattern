/*
 * File:    SaveUser.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:34:43
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class SaveUser {
    
    private final List<Memento> list = new ArrayList<>();
    
    public void add(Memento memento) {
        list.add(memento);
    }
    
    public Memento get(int index) {
        return list.get(index);
    }
    
    public int size() {
        return list.size();
    }
}
