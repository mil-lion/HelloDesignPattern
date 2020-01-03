/*
 * File:    MicroMarket.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.proxy.db;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface MicroMarket {

    /**
     * Get the value of zipCode
     *
     * @return the value of zipCode
     */
    String getZipCode();

    /**
     * Set the value of zipCode
     *
     * @param zipCode new value of zipCode
     */
    void setZipCode(String zipCode);

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    Double getRadius();

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    void setRadius(Double radius);

    /**
     * Get the value of areaWidth
     *
     * @return the value of areaWidth
     */
    Double getAreaWidth();

    /**
     * Set the value of areaWidth
     *
     * @param areaWidth new value of areaWidth
     */
    void setAreaWidth(Double areaWidth);

    /**
     * Get the value of areaLength
     *
     * @return the value of areaLength
     */
    Double getAreaLength();

    /**
     * Set the value of areaLength
     *
     * @param areaLength new value of areaLength
     */
    void setAreaLength(Double areaLength);
}
