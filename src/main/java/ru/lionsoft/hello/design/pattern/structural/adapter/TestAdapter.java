/*
 * File:    TestAdapter.java
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
public class TestAdapter {

    public static void main(String[] args) {

        PBank pBank = new PBank();
        printBalance(pBank);

        PBank aBank = new PBankAdapter();
        printBalance(aBank);
        
        incrementBalance(pBank, 500);
        incrementBalance(aBank, 1000);
    }
    
    public static void printBalance(PBank bank) {
        System.out.println("balance = " + bank.getBalance());
    }

    public static void incrementBalance(PBank bank, int sum) {
        bank.setBalance(bank.getBalance() + sum);
    }
}
