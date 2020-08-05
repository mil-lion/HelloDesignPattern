/*
 * File:    ABank.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.adapter;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ABank {

    private long balance = 200;

    public ABank() {
    }

    public long getAccountBalance() {
        System.out.println("ABank balance = " + balance);
        return balance;
    }
    
    public void setAccountBalance(long balance) {
        this.balance = balance;
        System.out.println("ABank new balance = " + this.balance);
    }
}
