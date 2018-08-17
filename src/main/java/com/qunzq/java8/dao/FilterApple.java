package com.qunzq.java8.dao;


import com.qunzq.java8.model.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Qun on 2018/8/17.
 */
public class FilterApple {


    public static List<Apple> findGreenApple(List<Apple> list) {
        List<Apple> newList = new ArrayList<>();
        for (Apple apple : list) {
            if ("green".equals(apple.getColor())) {
                newList.add(apple);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green", 150l), new Apple("green", 160l), new Apple("yellow", 150l));
        List<Apple> greenApple = findGreenApple(list);
        System.out.println(greenApple);
    }

}
