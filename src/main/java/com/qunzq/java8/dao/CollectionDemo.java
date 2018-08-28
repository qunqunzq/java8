package com.qunzq.java8.dao;

import com.qunzq.java8.model.Apple;

import java.util.*;

/**
 * Created by Qun on 2018/8/28.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green",99l),
                new Apple("green",88l),
                new Apple("green",55l),
                new Apple("yellow",66l),
                new Apple("green",36l),
                new Apple("yellow",56l),
                new Apple("yellow",25l));

        Optional.ofNullable(groupbycolor(list)).ifPresent(System.out::println);
        Optional.ofNullable(groupFunction(list)).ifPresent(System.out::println);
    }

    private static Map<String, List<Apple>> groupbycolor(List<Apple> list){
        Map<String,List<Apple>> map = new HashMap<>();
        for(Apple apple : list){
            List<Apple> apples = map.get(apple.getColor());
            if(null == apples){
                apples = new ArrayList<Apple>();
                map.put(apple.getColor(),apples);
            }
            apples.add(apple);
        }
        return map;
    }

    private static Map<String,List<Apple>> groupFunction(List<Apple> list){
        Map<String,List<Apple>> map = new HashMap<>();
        list.stream().forEach(a ->{
            List<Apple> appleList =  Optional.ofNullable(map.get(a.getColor())).orElseGet(()->{
                List<Apple>  appleL = new ArrayList<Apple>();
                map.put(a.getColor(),appleL);
                return appleL;
            });
            appleList.add(a);
        });
        return map;
    }
}
