package com.qunzq.java8.dao;

import com.qunzq.java8.model.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by Qun on 2018/8/19.
 */
public class ConsumerDemo {

    public static void findByConsumer(List<Apple> apples, Consumer<Apple> consumer){
        for(Apple apple: apples){
            consumer.accept(apple);
        }

    }

    public static void findByBiConsumer(String s,List<Apple> apples, BiConsumer<Apple,String> consumer){
        for(Apple apple: apples){
            consumer.accept(apple,s);
        }

    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green", 150l), new Apple("green", 160l), new Apple("yellow", 150l));
        findByConsumer(list,apple -> System.out.println(apple.getColor()));

        findByBiConsumer("sss",list,(apple,s)-> System.out.println(apple.getColor()+"===="+s));

    }
}
