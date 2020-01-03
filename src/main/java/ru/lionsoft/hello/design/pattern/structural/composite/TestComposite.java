/*
 * File:    TestComposite.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.composite;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestComposite {

    public static void main(String[] args) {

        Component tree = new Composite();
        tree.add(new Composite());
        tree.add(new Composite());
        tree.add(new Leaf());
        tree.getChild(0).add(new Leaf());
        tree.getChild(0).add(new Leaf());
        tree.getChild(1).add(new Leaf());
        tree.getChild(1).add(new Composite());
        tree.getChild(1).getChild(1).add(new Leaf());
        tree.getChild(1).getChild(1).add(new Leaf());

        operation(tree, 1);
    }

    private static void operation(Component component, int level) {
        System.out.print("level: " + level + " -> ");
        component.operation();
        if (component instanceof Composite) {
            for (Component child : component.getChilds()) {
                operation(child, level + 1);
            }
        }
    }
}
