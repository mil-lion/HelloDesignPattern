/*
 * File:    TestBuilder.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.builder;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestBuilder {

    public static void main(String[] args) {
        Buld buld = new Buld(2);
        Car car = buld.buildCar();
        System.out.println("car = " + car);

        StringBuilder sb = new StringBuilder();
//        StringBuffer sbf = new StringBuffer();
        String str = sb
                .append("Hello")
                .append(' ')
                .insert(0, "Example: ")
                .append("World")
                .append('!')
                .toString() // build
                ;
        System.out.println("str = " + str);

        sb = new StringBuilder();
        sb.append("Hello");
        sb.append(' ');
        sb.insert(0, "Example: ");
        sb.append("World");
        sb.append('!');
        str = sb.toString(); // build
        System.out.println("str = " + str);

        Box b1 = new BoxBuilder()
                .setWidth(1)
                .setHeight(2)
//                .setLength(3)
                .createBox();
        System.out.println("b1 = " + b1);
    }
}
