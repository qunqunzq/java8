package com.qunzq.java8.dao;


import com.qunzq.java8.impl.GreenAppleFilter;
import com.qunzq.java8.impl.YellowAppleFilter;
import com.qunzq.java8.inferface.AppleFiter;
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

    public static List<Apple> findAppleByColor(List<Apple> list,String color){
        List<Apple> newList = new ArrayList<>();
        for(Apple apple : list){
            if(color.equals(apple.getColor())){
                newList.add(apple);
            }
        }
        return newList;
    }

    public static  List<Apple> findApple(List<Apple> list, AppleFiter appleFiter){
        List<Apple> newList = new ArrayList<>();
        for(Apple apple : list){
            Boolean fiter = appleFiter.fiter(apple);
            if(fiter){
                newList.add(apple);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green", 150l), new Apple("green", 160l), new Apple("yellow", 150l));
       // List<Apple> greenApple = findGreenApple(list);
       // List<Apple> green = findAppleByColor(list, "green");
       // List<Apple> apple = findApple(list, new YellowAppleFilter());
      /*  List<Apple> green = findApple(list, (Apple apple) -> {
            return apple.getColor().equals("green");
        });
        System.out.println(green);*/
      Thread thread = new Thread(() -> {
          System.out.println("1");
      });
      new Thread(() -> {
          System.out.println("2");
      }).start();
      thread.start();
    }

}
