/*
 * File:    CarInvoker.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class CarInvoker {
    
    private final List<Command> commands = new ArrayList<>();

    public CarInvoker() {
    }
    
    public void addCommand(Command command) {
        commands.add(command);
    }
    
    public void clearCommands() {
        commands.clear();
    }
    
    public void execute() {
        commands.forEach((cmd) -> cmd.execute());
    }
    
}
