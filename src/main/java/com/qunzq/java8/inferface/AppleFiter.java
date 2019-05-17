package com.qunzq.java8.inferface;

import com.qunzq.java8.model.Apple;

/**
 * Created by Qun on 2018/8/19.
 */
@FunctionalInterface
public interface AppleFiter {

    public Boolean fiter(Apple apple);

    // 求平方根
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
