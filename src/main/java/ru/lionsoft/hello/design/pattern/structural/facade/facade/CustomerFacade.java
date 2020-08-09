/*
 * File:    CustomerFacade.java
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
import ru.lionsoft.hello.design.pattern.structural.facade.entity.Customer;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.ConnectionManager;

/**
 * Фасад для работы с сущностью Клиент
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class CustomerFacade extends AbstractFacade<Customer> {

    public CustomerFacade(Connection connection) {
        super(Customer.class, connection);
    }
    
    // **************** Facade Methods **************
    
    public List<Customer> findByName(String name) throws SQLException {
        List<Customer> result = new ArrayList<>();
        String sqlText = sqlTextFindAll + " WHERE name = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sqlText);) {
            pstmt.setString(1, name);
            try (ResultSet rs = pstmt.executeQuery();) {
                while (rs.next()) {
                    result.add(entityFactory.createEntity(rs));
                }
            }
        }
        return result;
    }
    
    
    // **************** Private *********************
    
    private final ConnectionManager connectionManager = new ConnectionManager();    
    
}
