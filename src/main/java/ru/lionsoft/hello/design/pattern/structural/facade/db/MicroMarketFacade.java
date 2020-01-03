/*
 * File:    MicroMarketFacade.java
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
public class MicroMarketFacade extends AbstractFacade<MicroMarket> {

    public MicroMarketFacade() {
        super("MICRO_MARKET", "ZIP_CODE", MicroMarket.class);
    }

    public List<MicroMarket> findByRadius(int radius) throws SQLException {
        List<MicroMarket> result = new ArrayList<>();
        try (Statement stmt = connection.createStatement();) {
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName + " WHERE radius = " + radius);) {
                while (rs.next()) {
                    result.add(EntityFactory.createEntity(rs, entityClass));
                }
            }
        }
        return result;
    }
}
