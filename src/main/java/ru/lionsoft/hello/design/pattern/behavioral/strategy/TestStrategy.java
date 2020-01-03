/*
 * File:    TestStrategy.java
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
public class TestStrategy {

    public static void main(String[] args) {
        Context context = new Context(new DownloadHttpStrategy());
        context.download("file.txt");

        context = new Context(new DownloadFtpStrategy());
        context.download("file.txt");

    }
}
