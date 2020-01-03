/*
 * File:    Numbers.java
 * Project: HelloDesignPattern
 * Date:    13 дек. 2019 г. 19:21:54
 * Author:  Igor Morenko <morenko at lionsoft.ru>
 * 
 * Copyright 2005-2019 LionSoft LLC. All rights reserved.
 */
package ru.lionsoft.hello.design.pattern.behavioral.iterator;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
public class Numbers {
 
    private final int[] nums;

    public Numbers(int[] nums) {
        this.nums = nums;
    }
    
    public Iterator getIterator() {
        return new NumberIterator();
    }
    
    private class NumberIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < nums.length;
        }

        @Override
        public Object next() {
            return hasNext() ? nums[index++] : null;
        }
        
        
    }
}
