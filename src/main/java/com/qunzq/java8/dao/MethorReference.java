package com.qunzq.java8.dao;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Qun on 2018/8/19.
 */
public class MethorReference {

    public static void main(String[] args) {
        int i = Integer.parseInt("123");
        System.out.println(i);
        Function<String, Integer> s = Integer::parseInt;
        Integer apply = s.apply("1234");
        System.out.println(apply);
        String dd = "12345";
        char c = dd.charAt(2);
        System.out.println(c);
        BiFunction<String, Integer, Character> v = String::charAt;
        Character apply1 = v.apply("2eee", 2);
        System.out.println(apply1);
    }
}
