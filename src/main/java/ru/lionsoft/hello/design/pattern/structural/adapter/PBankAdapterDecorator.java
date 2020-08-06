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
 * Декорирует и адаптирует ABank к PBank
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class PBankAdapterDecorator extends PBank {

    private final ABank delegate;

    public PBankAdapterDecorator(ABank delegate) {
        this.delegate = delegate;
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
