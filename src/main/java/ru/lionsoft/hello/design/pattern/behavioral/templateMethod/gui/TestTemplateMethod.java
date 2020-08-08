/*
 * File:    TestTemplateMethod.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 12:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.templateMethod.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Тестирование Шаблонного метода drawShape
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class TestTemplateMethod extends JComponent {
    
    public static void main(String[] args) {
        System.out.println("@@@@ main()");
        JFrame frame = new JFrame("Test Template Method");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TestTemplateMethod());
        frame.setVisible(true);
    }
    
    // ************ Private *************
    
    private final List<AbstractShape> shapes = new ArrayList<>();

    public TestTemplateMethod() {
        System.out.println("@@@@ init()");
        shapes.add(new Line(Color.RED, 10, 10, 150, 100));
        shapes.add(new Text(Color.BLUE, 100, 20, "Hello Bridge!"));
        shapes.add(new Rectangle(Color.ORANGE, 100, 200, 150, 100));
        shapes.add(new Oval(Color.MAGENTA, 400, 200, 150, 100));
        shapes.add(new FillRectangle(Color.CYAN, 110, 210, 130, 80));
        shapes.add(new FillOval(Color.GREEN, 400, 200, 130, 80));
    }

    // ******************* Override of JComponent **********************
    
    @Override
    public void paint(Graphics g) {
        System.out.println("@@@@ paint()");
        // Invoke Template Method
        shapes.forEach(shape -> shape.drawShape(g));
    }       
}
