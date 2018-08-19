package com.qunzq.java8.dao;

import com.qunzq.java8.model.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/**
 * Created by Qun on 2018/8/19.
 */
public class PredicateDemo {

    //predicate 断言表达式
    public static List<Apple> findbyPredicate (List<Apple> list, Predicate<Apple> predicate){
        List<Apple> newList = new ArrayList<>();
        for(Apple apple : list){
            if(predicate.test(apple)){
                newList.add(apple);
            }
        }
         return newList;
    }

    //Longpredicate 断言表达式
    public static List<Apple> findbyLongPredicate (List<Apple> list, LongPredicate predicate){
        List<Apple> newList = new ArrayList<>();
        for(Apple apple : list){
            if(predicate.test(apple.getWeight())){
                newList.add(apple);
            }
        }
        return newList;
    }

    //Bipredicate 断言表达式
    public static List<Apple> findbyBiPredicate (List<Apple> list, BiPredicate<String,Long> predicate){
        List<Apple> newList = new ArrayList<>();
        for(Apple apple : list){
            if(predicate.test(apple.getColor(),apple.getWeight())){
                newList.add(apple);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green", 151l)
                , new Apple("green", 160l)
                , new Apple("yellow", 150l));
        List<Apple> green = findbyPredicate(list, apple -> apple.getColor().equals("yellow"));
        System.out.println(green);

        List<Apple> apples = findbyLongPredicate(list, l -> l > 150);
        System.out.println(apples);

        List<Apple> green1 = findbyBiPredicate(list, (s, l) -> s.equals("green") && l > 155);
        System.out.println(green1);


    }
}
