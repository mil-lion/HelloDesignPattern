/*
 * File:    MicroMarketFacade.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.facade;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import ru.lionsoft.hello.design.pattern.structural.facade.entity.MicroMarket;

/**
 * Фасад для работы с сущностью Магазин
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class MicroMarketFacade extends AbstractFacade<MicroMarket> {

    public MicroMarketFacade(Connection connection) {
        super(MicroMarket.class, connection);
    }

    // **************** Facade Methods **************

    public List<MicroMarket> findByRadius(int radius) throws SQLException {
        List<MicroMarket> result = new ArrayList<>();
        String sqlText = sqlTextFindAll + " WHERE radius = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sqlText);) {
            pstmt.setInt(1, radius);
            try (ResultSet rs = pstmt.executeQuery();) {
                while (rs.next()) {
                    result.add(entityFactory.createEntity(rs));
                }
            }
        }
        return result;
    }
}
