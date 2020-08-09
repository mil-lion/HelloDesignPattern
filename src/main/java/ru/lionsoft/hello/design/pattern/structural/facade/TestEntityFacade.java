/*
 * File:    TestEntityFacade.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade;

import ru.lionsoft.hello.design.pattern.structural.facade.entity.DiscountCode;
import ru.lionsoft.hello.design.pattern.structural.facade.entity.MicroMarket;
import java.util.List;
import ru.lionsoft.hello.design.pattern.structural.facade.entity.Customer;
import ru.lionsoft.hello.design.pattern.structural.facade.facade.CustomerFacade;
import ru.lionsoft.hello.design.pattern.structural.facade.facade.DiscountCodeFacade;
import ru.lionsoft.hello.design.pattern.structural.facade.facade.MicroMarketFacade;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.ConnectionManager;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestEntityFacade {

    public static void main(String[] args) throws Exception {

        try (ConnectionManager connectionManager = new ConnectionManager();) {
            
            DiscountCodeFacade discountCodeFacade = new DiscountCodeFacade(connectionManager.getConnection());
            MicroMarketFacade microMarketFacade = new MicroMarketFacade(connectionManager.getConnection());
            CustomerFacade customerFacade = new CustomerFacade(connectionManager.getConnection());

            System.out.println("#### Discount Code ####");
            List<DiscountCode> discountCodes = discountCodeFacade.findAll();
            System.out.println("DiscountCodes:");
            discountCodes.forEach(System.out::println);
            System.out.println("DiscountCode.count = " + discountCodeFacade.count());

            System.out.println("\n#### Micro Market ####");
            MicroMarket microMarket = microMarketFacade.find("95051");
            System.out.println("microMarket = " + microMarket);
            System.out.println("MicroMarket.count = " + microMarketFacade.count());

            System.out.println("\n#### Customer ####");
            // SELECT
            Customer customer = customerFacade.find(1);
            System.out.println("customer = " + customer);
            List<Customer> customers = customerFacade.findAll();
            System.out.println("Customers:");
            customers.forEach(System.out::println);
            System.out.println("Customer.count = " + customerFacade.count());

            // INSERT
            Customer newCustomer = new Customer((int) (System.nanoTime() & 0x7fffffff));
            newCustomer.discountCode = "H";
            newCustomer.zip = "95051";
            newCustomer.name = "XXX";
            customerFacade.create(newCustomer);
            System.out.println("inserted newCustomer: " + newCustomer);

            // UPDATE
            newCustomer.email = "xxx@mail.ru";
            customerFacade.update(newCustomer);
            System.out.println("updated newCustomer: " + newCustomer);

            // DELETE
            customerFacade.delete(newCustomer.id);
            
            connectionManager.getConnection().commit();
        }
    }
}
