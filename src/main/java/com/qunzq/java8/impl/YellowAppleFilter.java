package com.qunzq.java8.impl;

import com.qunzq.java8.inferface.AppleFiter;
import com.qunzq.java8.model.Apple;

/**
 * Created by Qun on 2018/8/19.
 */
public class YellowAppleFilter implements AppleFiter {
    @Override
    public Boolean fiter(Apple apple) {
        if("yellow".equals(apple.getColor())){
            return true;
        }
        return false;
    }
}
