package com.qunzq.java8.dao;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.qunzq.java8.model.Apple;
import com.qunzq.java8.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Created by Qun on 2018/8/25.
 */
public class OptionDemo {
    static class runDemo implements Runnable{

        @Override
        public void run() {
            IntStream.range(0,10).forEach(i -> System.out.println(i));
        }
    }
    static class ThreDemo extends Thread{
        @Override
        public void run() {
             IntStream.range(0,10).forEach(i -> {
                 System.out.println("1111"+i);
             });
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Oragle  oragle = new Oragle();

        oragle.setName("ha");
        System.out.println(oragle.ttt());
        System.out.println(oragle.getName());
          /*  List<String> allList = null;
            for(String s: allList){
                System.out.println(s);
            }
            byte b = 1;
            short a = 1;
    */
       /* ThreDemo threDemo = new ThreDemo();
        threDemo.start();

        Thread a = new Thread(new runDemo());
        a.start();
        System.out.println("21313");
        new Thread(()->{
            IntStream.range(0,10).forEach(i -> {
                System.out.println("222"+i);
            });
        }).start();
        Thread.sleep(1000000);*/
        // System.out.println(split[2]);
       // Splitter.on("/").omitEmptyStrings();
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
