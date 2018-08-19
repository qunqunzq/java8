package com.qunzq.java8.dao;

import com.qunzq.java8.model.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Qun on 2018/8/19.
 */
public class ListSort {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green", 151l)
                , new Apple("green", 160l)
                , new Apple("yellow", 150l));
       /* Comparator<Apple> comparator = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };*/
       Comparator<Apple> comparator = (o1, o2) -> o1.getWeight().compareTo(o2.getWeight());
        list.sort(comparator);
        System.out.println(list);
    }
}
