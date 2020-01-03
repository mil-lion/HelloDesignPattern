/*
 * File:    Observer.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.observer;

import java.util.List;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface Observer {
    
    void event(List<String> strings);
}
