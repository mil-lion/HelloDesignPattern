/*
 * File:    Iterator.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:21:14
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.iterator;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface Iterator {
    
    boolean hasNext();
    
    Object next();
}
