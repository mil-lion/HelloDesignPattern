/*
 * File:    MasterCardPayment.java
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
public class MasterCardPayment extends Payment {

    @Override
    public void pay(int num) {
        if ((num % 2) != 0)
            System.out.println("MasterCard Payment #" + num);
        if (next != null) next.pay(num);
    }

}
