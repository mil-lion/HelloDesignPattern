/*
 * File:    MicroMarket.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.facade.entity;

import java.io.Serializable;
import java.util.Objects;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Column;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Id;
import ru.lionsoft.hello.design.pattern.structural.facade.orm.annotation.Table;

/**
 * Сущность Магазин (MicroMarket)
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
@Table(name = "MICRO_MARKET")
public class MicroMarket implements Serializable {

    private static final long serialVersionUID = 1L;

    // ******************* Fields **********************

    @Id
    @Column(name = "ZIP_CODE")
    public String zipCode;
    
    @Column 
    public Double radius;
    
    @Column(name = "AREA_WIDTH")
    public Double areaWidth;
    
    @Column(name = "AREA_LENGTH")
    public Double areaLength;

    // ******************* Constructors **********************

    public MicroMarket() {
    }

    public MicroMarket(String zipCode) {
        this.zipCode = zipCode;
    }

    public MicroMarket(String zipCode, Double radius, Double areaWidth, Double areaLength) {
        this.zipCode = zipCode;
        this.radius = radius;
        this.areaWidth = areaWidth;
        this.areaLength = areaLength;
    }
    
    // ******************* Equals & HashCode **********************

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.zipCode);
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
        final MicroMarket other = (MicroMarket) obj;
        return Objects.equals(this.zipCode, other.zipCode);
    }

    // ******************* Cast to String **********************

    @Override
    public String toString() {
        return "MicroMarket{" 
                + "zipCode=" + zipCode 
                + ", radius=" + radius 
                + ", areaWidth=" + areaWidth 
                + ", areaLength=" + areaLength 
                + '}';
    }

}
