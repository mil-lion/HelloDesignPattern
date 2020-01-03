/*
 * File:    MicroMarket.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.factory.db;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class MicroMarket implements Serializable {

    private String zipCode;

    /**
     * Get the value of zipCode
     *
     * @return the value of zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Set the value of zipCode
     *
     * @param zipCode new value of zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private Double radius;

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    private Double areaWidth;

    /**
     * Get the value of areaWidth
     *
     * @return the value of areaWidth
     */
    public Double getAreaWidth() {
        return areaWidth;
    }

    /**
     * Set the value of areaWidth
     *
     * @param areaWidth new value of areaWidth
     */
    public void setAreaWidth(Double areaWidth) {
        this.areaWidth = areaWidth;
    }

    private Double areaLength;

    /**
     * Get the value of areaLength
     *
     * @return the value of areaLength
     */
    public Double getAreaLength() {
        return areaLength;
    }

    /**
     * Set the value of areaLength
     *
     * @param areaLength new value of areaLength
     */
    public void setAreaLength(Double areaLength) {
        this.areaLength = areaLength;
    }

    public MicroMarket() {
    }

    public MicroMarket(String zipCode) {
        this.zipCode = zipCode;
    }

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
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MicroMarket{" + "zipCode=" + zipCode + ", radius=" + radius + ", areaWidth=" + areaWidth + ", areaLength=" + areaLength + '}';
    }

}
