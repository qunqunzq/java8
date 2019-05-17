package com.qunzq.java8.dao;

import com.qunzq.java8.model.Apple;
import com.qunzq.java8.model.Car;

import java.util.Optional;

/**
 * Created by Qun on 2018/8/25.
 */
public class OptionDemo {
    public static void main(String[] args) {
      /*  Apple apple = new Apple();
        Optional<Apple> empty = Optional.<Apple>empty();
        Optional<Apple> o = Optional.<Apple>ofNullable(null);
        Apple apple1 = o.orElse(new Apple());
        Car cc = new Car();
        cc.setApple(apple);
        apple.setWeight(11l);
        Optional<Car> car = Optional.ofNullable(cc);
       *//* car.orElseThrow(()->new RuntimeException("没"));
        car.orElse(createCar());
        car.orElseGet(()-> createCar() );*//*
        Long aLong = car.map(u -> u.getApple()).map(a -> a.getWeight()).orElse(12344444l);
        System.out.println(aLong);*/
    }

    public static Car createCar(){
        System.out.println("生成了一个car");
        return new Car();
    }
}
