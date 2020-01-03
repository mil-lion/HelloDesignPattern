/*
 * File:    DiscountCode.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.db;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class DiscountCode implements Serializable {

    private String discountCode;

    /**
     * Get the value of discountCode
     *
     * @return the value of discountCode
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Set the value of discountCode
     *
     * @param discountCode new value of discountCode
     */
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    private BigDecimal rate;

    /**
     * Get the value of rate
     *
     * @return the value of rate
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Set the value of rate
     *
     * @param rate new value of rate
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public DiscountCode() {
    }

    public DiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.discountCode);
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
        final DiscountCode other = (DiscountCode) obj;
        if (!Objects.equals(this.discountCode, other.discountCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DiscountCode{" + "discountCode=" + discountCode + ", rate=" + rate + '}';
    }
}
