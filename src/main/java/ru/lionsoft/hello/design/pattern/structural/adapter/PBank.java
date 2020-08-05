/*
 * File:    PBank.java
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
public class PBank {

    private int balance = 100;

    public PBank() {
    }

    public int getBalance() {
        System.out.println("PBank balance = " + balance);
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("PBank new balance = " + this.balance);
    }
}
