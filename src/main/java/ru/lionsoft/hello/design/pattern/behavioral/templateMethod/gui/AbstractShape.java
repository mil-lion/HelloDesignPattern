/*
 * File:    Car.java
 * Project: HelloDesignPattern
 * Date:    07 авг. 2020 г. 12:18:56
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2020 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.templateMethod.gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Абстрактная фигура
 * @author Igor Morenko (emailto:imorenko@yandex.ru)
 */
public abstract class AbstractShape {
    
    // **************** Properties ************************

    protected int x, y;
    protected Color color;
    
    // ***************** Constructors *********************
    
    public AbstractShape() {
    }

    public AbstractShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // *************** Private Methods *******************
        
    private Color oldColor;
    
    private void saveAndSetColor(Graphics g) {
        oldColor = g.getColor();
        g.setColor(color);
    }
    
    private void restoreColor(Graphics g) {
        g.setColor(oldColor);
    }
    
    // **************** Cast to String ********************

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" 
                + "color=" + color 
                + ", x=" + x 
                + ", y=" + y 
                ;
    }
        
    // ************* Abstract Method *********************

    /**
     * Подготовка фигуры к рисованию
     * @param g графический контекст
     */
    protected abstract void preDraw(Graphics g);

    /**
     * Отрисовка фигуры
     * @param g графический контекст
     */
    protected abstract void draw(Graphics g);

    /**
     * Завершение рисования фигуры
     * @param g графический контекст
     */
    protected abstract void postDraw(Graphics g);
    
    // *********** Template Method *********************
    
    /**
     * Нарисовать фигуру (Шаблонный )
     * @param g графический контекст
     */
    public void drawShape(Graphics g) {
        // Алгоритм отрисовки
        saveAndSetColor(g);
        preDraw(g);
        draw(g);
        postDraw(g);
        restoreColor(g);
    }

}
