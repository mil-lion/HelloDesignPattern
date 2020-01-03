/*
 * File:    Factory.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.factory;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Factory {

    public OS getCurrentOS() {
        return getCurrentOS(System.getProperty("user.os"));
    }

    public OS getCurrentOS(String osName) {
        if (osName == null) {
            throw new IllegalArgumentException("osName is null");
        }
        switch (osName) {
            case "windows":
                return new WindowsOS();
            case "linux":
                return new LinuxOS();
            case "mac":
                return new MacOS();
            default:
                throw new IllegalArgumentException("osName = {windows, linux, mac}");//return null;
        }
    }
}
