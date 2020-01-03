/*
 * File:    TestChainOfResponsibility.java
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
public class TestChainOfResponsibility {
    
    public static void main(String[] args) {
        Payment visa = new VisaPayment();
        Payment masterCard = new MasterCardPayment();
        Payment payPal = new PayPalPayment();
        visa.setNext(masterCard);
        masterCard.setNext(payPal);
        
        visa.pay(123);
        System.out.println("####");
        visa.pay(542);
    }
}
