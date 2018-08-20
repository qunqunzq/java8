package com.qunzq.java8.model;

/**
 * Created by Qun on 2018/8/17.
 */
public class Apple {

    private String color;
    private Long weight;

    public Apple(String color, Long weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple() {

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
