/*
 * File:    Leaf.java
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
public class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println("Leaf.operation()");
    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public List<Component> getChilds() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
