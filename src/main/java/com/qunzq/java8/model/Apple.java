package com.qunzq.java8.model;

import java.io.Serializable;

/**
 * Created by Qun on 2018/8/17.
 */
public class Apple implements Serializable {


    private static final long serialVersionUID = -6764070585338871671L;
    private String color ;
    private Long weight ;
    private int size ;
    private String source ;

    public static class Builder{
        private String color ;
        private Long weight ;
        private int size ;
        private String source ;
        public Builder addWeight(Long val){
            this.weight = val;
            return  this;
        }
        public Builder addColor(String val){
            this.color = val;
            return  this;
        }
        public Builder addSize(int val){
            this.size = val;
            return  this;
        }
        public Builder addSource(String val){
            this.source = val;
            return  this;
        }
        public Apple builder(){
            return new Apple(this);
        }

    }
    public Apple(Builder builder){
        this.color = builder.color;
        this.weight = builder.weight;
        this.size = builder.size;
        this.source = builder.source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Apple(String color, Long weight) {
        this.color = color;
        this.weight = weight;
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
                ", size=" + size +
                ", source='" + source + '\'' +
                '}';
    }
}
