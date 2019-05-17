package com.qunzq.java8.impl;

import com.qunzq.java8.inferface.AppleFiter;
import com.qunzq.java8.model.Apple;

/**
 * Created by Qun on 2018/8/19.
 */
public class GreenAppleFilter implements AppleFiter {
    @Override
    public Boolean fiter(Apple apple) {
        if("green".equals(apple.getColor())){
            return true;
        }
        return false;
    }
    // 求平方根
     public double sqrt(int a) {
        return a*a;
    }
}
