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

    private long balance = 100;

    public PBank() {
    }

    public void getBalance() {
        System.out.println("PBank balance = " + balance);
    }

}
