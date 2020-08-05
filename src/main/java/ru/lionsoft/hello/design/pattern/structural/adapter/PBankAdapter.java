/*
 * File:    PBankAdapter.java
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
public class PBankAdapter extends PBank {

    private final ABank delegate;

    public PBankAdapter() {
        this.delegate = new ABank();
    }

    @Override
    public int getBalance() {
        return (int) delegate.getAccountBalance();
    }

    @Override
    public void setBalance(int balance) {
        delegate.setAccountBalance(balance);
    }
    
    
}
