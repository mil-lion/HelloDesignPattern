/*
 * File:    TestJpa.java
 * Project: HelloDesignPattern
 * Date:    6 авг. 2020 г. 00:50:48
 * Author:  Igor Morenko
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.abstractFactory.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Тестирование Абстрактной Фабрики JPA (EclipseLink & Hibernate)
 * @author Igor Morenko
 */
public class TestJpa {
    
    public static void main(String[] args) {
        test("EclipseLinkPU");
        test("HibernatePU");
    }
    
    public static void test(String persistenceUnitName) {
        System.out.println("\n#### Test JPA: " + persistenceUnitName + " ####\n");
        
        // Create Abstarct Factory from Factory Method
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        System.out.println("@@@@ Abstract Factory class: " + emf.getClass().getName());
        
        // Create Entity Manager from Abstract Factory
        EntityManager em = emf.createEntityManager();
        System.out.println("@@@@ Entity Manager class: " + em.getClass().getName());
        
        // Find Entity using Entity Manager
        Customer customer = em.find(Customer.class, 1);
        System.out.println("\nCustomer = " + customer);
    }
}
