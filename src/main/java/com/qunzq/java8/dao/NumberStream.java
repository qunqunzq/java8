package com.qunzq.java8.dao;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Qun on 2018/8/22.
 */
public class NumberStream {
    public static void main(String[] args) {
        Stream stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
        int b = 9;
        IntStream.rangeClosed(1, 100).filter((a -> (a + b) > 90)).forEach(System.out::println);

    }
}
