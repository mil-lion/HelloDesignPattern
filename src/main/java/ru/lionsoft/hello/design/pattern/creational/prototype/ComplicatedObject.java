/*
 * File:    ComplicatedObject.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.creational.prototype;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class ComplicatedObject implements Copyable {

    public enum Type {
        ONE,
        TWO
    }

    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public ComplicatedObject copy() {
        ComplicatedObject copy = new ComplicatedObject();
        copy.setType(type);
        return copy;
    }
}
