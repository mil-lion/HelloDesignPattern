/*
 * File:    TestEntityFacade.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.db;

import java.util.List;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestEntityFacade {

    public static void main(String[] args) throws Exception {

        DiscountCodeFacade discountCodeFacade = new DiscountCodeFacade();
        MicroMarketFacade microMarketFacade = new MicroMarketFacade();

        List<DiscountCode> discountCodes = discountCodeFacade.findAll();
        System.out.println("discountCodes = " + discountCodes);
        System.out.println("discountCode.count = " + discountCodeFacade.count());

        MicroMarket microMarket = microMarketFacade.find("95051");
        System.out.println("microMarket = " + microMarket);
        System.out.println("microMarket.count = " + microMarketFacade.count());
    }
}
