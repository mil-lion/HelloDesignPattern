/*
 * File:    DiscountCode.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Column;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Id;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Table;

/**
 * Сущность Скидка (DiscountCode)
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
@Table(name = "DISCOUNT_CODE")
public class DiscountCode implements Serializable {

    private static final long serialVersionUID = 1L;

    // ******************* Fields **********************

    @Id
    @Column(name = "DISCOUNT_CODE")
    public String code;
    
    @Column 
    public BigDecimal rate;

    // ******************* Constructors **********************

    public DiscountCode() {
    }

    public DiscountCode(String discountCode) {
        this.code = discountCode;
    }

    public DiscountCode(String code, BigDecimal rate) {
        this.code = code;
        this.rate = rate;
    }

    // ******************* Equals & HashCode **********************

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.code);
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
        return Objects.equals(this.code, other.code);
    }

    // ******************* Cast to String **********************

    @Override
    public String toString() {
        return "DiscountCode{" 
                + "code=" + code 
                + ", rate=" + rate 
                + '}';
    }
}
