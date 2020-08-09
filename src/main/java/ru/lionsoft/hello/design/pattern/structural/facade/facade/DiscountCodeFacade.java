/*
 * File:    DiscountCodeFacade.java
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
import ru.lionsoft.hello.design.pattern.structural.facade.entity.DiscountCode;

/**
 * Фасад для работы с сущностью Скидка
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class DiscountCodeFacade extends AbstractFacade<DiscountCode> {

    public DiscountCodeFacade(Connection connection) {
        super(DiscountCode.class, connection);
    }

    // **************** Facade Methods **************

    public List<DiscountCode> findByRate(double rate) throws SQLException {
        List<DiscountCode> result = new ArrayList<>();
        String sqlText = sqlTextFindAll + " WHERE rate = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sqlText);) {
            pstmt.setDouble(1, rate);
            try (ResultSet rs = pstmt.executeQuery();) {
                while (rs.next()) {
                    result.add(entityFactory.createEntity(rs));
                }
            }
        }
        return result;
    }
}
