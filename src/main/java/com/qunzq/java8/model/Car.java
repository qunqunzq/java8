package com.qunzq.java8.model;

/**
 * Created by Qun on 2018/8/25.
 */
public class Car {

    private String name;
    private String color;

    private Apple apple;


    public Car(String name, String color, Apple apple) {
        this.name = name;
        this.color = color;
        this.apple = apple;
    }

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
