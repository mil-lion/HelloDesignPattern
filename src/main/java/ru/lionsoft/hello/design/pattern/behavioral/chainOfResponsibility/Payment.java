/*
 * File:    Payment.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.chainOfResponsibility;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public abstract class Payment {
    
    public abstract void pay(int num);
    
    protected Payment next;
    
    public void setNext(Payment next) {
        this.next = next;
    }
}
