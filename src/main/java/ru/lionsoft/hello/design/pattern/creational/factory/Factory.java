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

    private String defaultOS = "windows";

    public Factory() {
    }
    
    public Factory(String defaultOsName) {
        this.defaultOS = defaultOsName;
    }
           
    public OS getUserOS() {
        return getOS(System.getProperty("user.os", defaultOS));
    }

    public OS getCurrentOS() {
        return getOS(System.getProperty("os.name"));
    }

    public OS getOS(String osName) {
        if (osName == null) {
            throw new IllegalArgumentException("osName is null");
        }
        switch (osName) {
            case "windows":
            case "Windows 7":
                return new WindowsOS();
            case "linux":
                return new LinuxOS();
            case "mac":
            case "Mac OS X":
                return new MacOS();
            default:
                throw new IllegalArgumentException("osName = {windows, linux, mac}");
        }
    }
}
