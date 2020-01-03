/*
 * File:    Composite.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Composite implements Component {

    @Override
    public void operation() {
        System.out.println("Composit.operation()");
    }

    // Tree 
    private List<Component> childs = new ArrayList<>();

    @Override
    public void add(Component c) {
        childs.add(c);
    }

    @Override
    public void remove(Component c) {
        childs.remove(c);
    }

    @Override
    public Component getChild(int index) {
        return childs.get(index);
    }

    @Override
    public int getLength() {
        return childs.size();
    }

    @Override
    public List<Component> getChilds() {
        return childs;
    }

}
