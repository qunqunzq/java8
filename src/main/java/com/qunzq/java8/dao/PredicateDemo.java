package com.qunzq.java8.dao;

import com.qunzq.java8.model.Apple;
import sun.security.pkcs11.wrapper.Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.*;

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
        Predicate<String> stringPredicate = s -> s.length() > 3;
        boolean test = stringPredicate.test("32132");
        boolean test1 = stringPredicate.negate().test("12313");
        Predicate<Boolean> nonNull = Objects::nonNull;
        boolean test2 = nonNull.test(false);
        Predicate<String> isEmpty = String::isEmpty;
        String aa = "22";

        Function<String,String> stringStringFunction = s -> String.valueOf(s.length());
        String apply = stringStringFunction.apply("123");
        System.out.println(apply);

        Function<String,Apple> function = s -> new Apple(s,12l);
        Apple dfs = function.apply("dfs");
        System.out.println(dfs);

        Function<String, Integer> stringIntegerIntegerBiFunction = Integer::valueOf;
        Integer apply1 = stringIntegerIntegerBiFunction.apply("123");
        Integer integer = Integer.valueOf("12");
        int i = Integer.parseInt("123");
        String s = Integer.toString(123);
        int maxValue = Integer.MAX_VALUE;
        long maxValue1 = Long.MAX_VALUE;
        Supplier<Apple> supplier = () -> new Apple("123", (long) 123);
        Supplier<Apple> supplier1 = Apple::new;
        Apple apple = supplier.get();
        Consumer<String> consumers = o -> System.out.println(o);
        consumers.accept("1");
        System.out.println(supplier1);


    }
}
