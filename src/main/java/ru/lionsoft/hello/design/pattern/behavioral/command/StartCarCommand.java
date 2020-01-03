/*
 * File:    StartCarCommand.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.command;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class StartCarCommand implements Command {
    
    private final Car car;

    public StartCarCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startKey();
        car.startEngine();
    }
    
}
