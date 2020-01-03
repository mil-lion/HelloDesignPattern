/*
 * File:    DiscountCode.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy.db;

import java.math.BigDecimal;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface DiscountCode {

    /**
     * Get the value of discountCode
     *
     * @return the value of discountCode
     */
    String getDiscountCode();

    /**
     * Set the value of discountCode
     *
     * @param discountCode new value of discountCode
     */
    void setDiscountCode(String discountCode);

    /**
     * Get the value of rate
     *
     * @return the value of rate
     */
    BigDecimal getRate();

    /**
     * Set the value of rate
     *
     * @param rate new value of rate
     */
    void setRate(BigDecimal rate);
}
