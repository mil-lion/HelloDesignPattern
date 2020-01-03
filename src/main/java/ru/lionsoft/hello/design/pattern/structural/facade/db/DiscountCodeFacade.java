/*
 * File:    DiscountCodeFacade.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class DiscountCodeFacade extends AbstractFacade<DiscountCode> {

    public DiscountCodeFacade() {
        super("DISCOUNT_CODE", "DISCOUNT_CODE", DiscountCode.class);
    }

    public List<DiscountCode> findByRate(double rate) throws SQLException {
        List<DiscountCode> result = new ArrayList<>();
        try (Statement stmt = connection.createStatement();) {
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName + " WHERE rate = " + rate);) {
                while (rs.next()) {
                    result.add(EntityFactory.createEntity(rs, entityClass));
                }
            }
        }
        return result;
    }
}
