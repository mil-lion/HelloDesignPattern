/*
 * File:    Component.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.composite;

import java.util.List;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public interface Component {

    // Business method
    void operation();

    // Tree support
    void add(Component c);

    void remove(Component c);

    Component getChild(int index);

    List<Component> getChilds();

    int getLength();

}
