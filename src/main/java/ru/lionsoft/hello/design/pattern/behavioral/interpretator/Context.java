/*
 * File:    Context.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:06:28
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.interpretator;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Context {
    
    public String getLowerCase(String str) {
        return str.toLowerCase();
    }
    
    public String getUpperCase(String str) {
        return str.toUpperCase();
    }
}
