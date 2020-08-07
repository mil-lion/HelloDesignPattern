/*
 * File:    TestBridge.java
 * Project: HelloDesignPattern
 * Date:    14 дек. 2019 г. 00:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.structural.bridge;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Тестирование Мостика (Bridge) между фигурами и устройством рисования
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public class TestBridge extends JComponent {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Bridge");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TestBridge());
        frame.setVisible(true);
    }
    
    // ************ Private *************
    
    private final List<AbstractShape> shapes = new ArrayList<>();

    public TestBridge() {
        shapes.add(new Line(Color.RED, 10, 10, 150, 100));
        shapes.add(new Text(Color.BLUE, 100, 20, "Hello Bridge!"));
        shapes.add(new Rectangle(Color.ORANGE, 100, 200, 150, 100));
        shapes.add(new Oval(Color.MAGENTA, 400, 100, 150, 100));
        shapes.add(new FillRectangle(Color.CYAN, 110, 210, 130, 80));
        shapes.add(new FillOval(Color.PINK, 400, 100, 130, 80));
        
        drawShapes(new TextPrinter()); // device 1
        drawShapes(new GraphicPrinter()); // device 2
    }

    // ****************** Use Bridge **********************************
    
    private void drawShapes(DrawDevice device) {
        shapes.forEach(shape -> shape.draw(device));
    }

    // ******************* Override of JComponent **********************
    
    private GraphicsAdapter adapter;
    
    @Override
    public void paint(Graphics g) {
        if (adapter == null) {
            adapter = new GraphicsAdapter(g);
        }
        drawShapes(adapter); // device 3
    }       
}
