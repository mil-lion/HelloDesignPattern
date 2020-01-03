/*
 * File:    DownloadHttpStrategy.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.strategy;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class DownloadHttpStrategy implements Strategy {

    @Override
    public void download(String file) {
        System.out.println("http download: http://localhost/" + file);
    }
}
