package com.qunzq.java8.model;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by Qun on 2019-04-03.
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPCITY = 16;

    public  Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPCITY];
    }
    public void push(Object o){
        ensureCapcity();
        elements[size++] = o;
    }
    public Object pop(){
        if(size==0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }
    private  void ensureCapcity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements,2 * size +1);
        }
    }
}
