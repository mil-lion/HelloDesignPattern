/*
 * File:    TestIterator.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:21:54
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class TestIterator {
    
    public static void main(String[] args) {
        
        Numbers numbers = new Numbers(new int[] {1, 2, 3, 4, 5});
        Iterator numIterator = numbers.getIterator();
        while (numIterator.hasNext()) {
            System.out.println(numIterator.next());
        }

        System.out.println("####");
       
        String text = "Последовательно осуществляет доступ к элементам объекта "
                + "коллекции, не зная его основного представления"; 
        List<String> words = new ArrayList<>();
        
        StringTokenizer tokenizer = new StringTokenizer(text, " ,");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            words.add(word);
            System.out.println(word);
        }
        
        System.out.println("####");
        
        java.util.Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word);
        }
     
    }
}
