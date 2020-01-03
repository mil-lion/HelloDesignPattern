/*
 * File:    TestCommand.java
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
public class TestCommand {
    
    public static void main(String[] args) {
        Car car = new Car();
        
        CarInvoker invoker = new CarInvoker();
        invoker.addCommand(new StartCarCommand(car));
        invoker.addCommand(() -> System.out.println("Поехали!"));
        invoker.addCommand(new StopCarCommand(car));
        invoker.execute();
        
        // Runnable interface
        
        Thread thread = new Thread(() -> {
            System.out.println("Start " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println("Loop #" + i);
                try {Thread.sleep(500); } catch (InterruptedException ex) {}
            }
             System.out.println("Stop " + Thread.currentThread().getName());
        }, "My Thread");
        thread.start();
    }
}
