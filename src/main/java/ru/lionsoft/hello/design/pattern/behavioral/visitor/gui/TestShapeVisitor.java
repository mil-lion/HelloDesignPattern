/*
 * File:    TestShapeVisitor.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 23:55:59
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.visitor.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Тестирование Посетителей фигур (Visitor)
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestShapeVisitor extends JComponent {

    public static void main(String[] args) {
        System.out.println("@@@@ main()");
        JFrame frame = new JFrame("Test Shape Visitor");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TestShapeVisitor());
        frame.setVisible(true);
    }

    private final List<AbstractShape> shapes = new ArrayList<>();

    public TestShapeVisitor() {
        System.out.println("@@@@ init()");
        // shapes init
        shapes.add(new Line(Color.BLUE, 10, 10, 100, 60));
        shapes.add(new Text(Color.RED, 100, 30, "Hello World!"));
        shapes.add(new Rectangle(Color.GREEN, 100, 50, 100, 70));
        shapes.add(new FillRectangle(Color.CYAN, 110, 60, 80, 50));
        shapes.add(new Oval(Color.PINK, 250, 150, 100, 70));
        shapes.add(new FillOval(Color.YELLOW, 250, 150, 80, 50));

        // Print Shapes
        ShapeVisitor printVisitor = new ShapeVisitorPrint(System.out);
        shapes.forEach(shape -> shape.accept(printVisitor));

        // Shape Statistics
        ShapeVisitorStatistics statVisitor = new ShapeVisitorStatistics();
        shapes.forEach(shape -> shape.accept(statVisitor));
        statVisitor.report();
    }

    private ShapeVisitor visitor;

    @Override
    public void paint(Graphics g) {
        System.out.println("@@@@ paint()");
        if (visitor == null) {
            visitor = new ShapeVisitorGraphics(g);
        }
        // Draw Shapes
        shapes.forEach(shape -> shape.accept(visitor));
    }

}
