/*
 * File:    Customer.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.entity;

import java.io.Serializable;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Column;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Id;

/**
 * Сущность Клиент (Customer)
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class Customer implements Serializable {
    
    private static final long serialVersionUID = 1L;

    // ******************* Fields **********************
    
    @Id 
    @Column(name = "CUSTOMER_ID")
    public int id;

    @Column(name = "DISCOUNT_CODE")
    public String discountCode;

    @Column 
    public String zip;

    @Column 
    public String name;    

    @Column 
    public String addressline1;

    @Column 
    public String addressline2;

    @Column 
    public String city;

    @Column 
    public String state;

    @Column 
    public String phone;

    @Column 
    public String fax;

    @Column
    public String email;

    @Column(name = "CREDIT_LIMIT")
    public int creditLimit;

    // ******************* Constructors **********************

    public Customer() {
    }

    public Customer(int id) {
        this.id = id;
    }

    public Customer(int id, String discountCode, String zip, String name, String addressline1, String addressline2, String city, String state, String phone, String fax, String email, int creditLimit) {
        this.id = id;
        this.discountCode = discountCode;
        this.zip = zip;
        this.name = name;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    // ******************* Equals & HashCode **********************

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        return this.id == other.id;
    }

    // ******************* Cast to String **********************

    @Override
    public String toString() {
        return "Customer{" 
                + "id=" + id 
                + ", discountCode=" + discountCode 
                + ", zip=" + zip 
                + ", name=" + name 
                + ", addressline1=" + addressline1 
                + ", addressline2=" + addressline2 
                + ", city=" + city 
                + ", state=" + state 
                + ", phone=" + phone 
                + ", fax=" + fax 
                + ", email=" + email 
                + ", creditLimit=" + creditLimit 
                + '}';
    }    
}
