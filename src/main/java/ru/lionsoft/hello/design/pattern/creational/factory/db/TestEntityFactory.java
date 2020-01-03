/*
 * File:    TestEntityFactory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.factory.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestEntityFactory {

    private static final Logger LOG = Logger.getLogger(TestEntityFactory.class.getName());

    private static final String DRIVER_CLASS = "org.apache.derby.jdbc.ClientDriver";
    private static final String DATABASE_URL = "jdbc:derby://localhost:1527/sample";
    private static final String DATABASE_USERNAME = "app";
    private static final String DATABASE_PASSWORD = "app";

    public static void main(String[] args) throws Exception {
        Class.forName(DRIVER_CLASS);
        Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);

        List<DiscountCode> discountCodes = findAllDiscountCodes(connection);
        System.out.println("discountCodes = " + discountCodes);

        MicroMarket microMarket = findMicroMarketById(connection, "95051");
        System.out.println("microMarket = " + microMarket);

        connection.close();
    }

    private static List<DiscountCode> findAllDiscountCodes(Connection connection) throws SQLException, Exception {
        List<DiscountCode> discountCodes = new ArrayList<>();
        try (Statement stmt = connection.createStatement();) {
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM discount_code");) {
                while (rs.next()) {
                    discountCodes.add(EntityFactory.createEntity(rs, DiscountCode.class));
                }
            }
        }
        return discountCodes;
    }

    private static MicroMarket findMicroMarketById(Connection connection, String id) throws SQLException, Exception {
        MicroMarket entity = null;
        try (PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM micro_market WHERE zip_code = ?");) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    entity = EntityFactory.createEntity(rs, MicroMarket.class);
                }
            }
        }
        return entity;
    }
}
