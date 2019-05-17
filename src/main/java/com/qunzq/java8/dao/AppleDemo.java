package com.qunzq.java8.dao;

import com.qunzq.java8.impl.GreenAppleFilter;
import com.qunzq.java8.inferface.AppleFiter;
import com.qunzq.java8.inferface.Converter;

/**
 * Created by Qun on 2019-05-17.
 */
public class AppleDemo {

    public static void main(String[] args) {
      /*  AppleFiter greenAppleFilter = new GreenAppleFilter();
        System.out.println(greenAppleFilter.sqrt(16));*/
        Converter<String,Integer>  converter = form -> Integer.valueOf(form);
        Integer conver = converter.conver("2");
        System.out.println(conver);
        System.out.println(conver);
        System.out.println(conver);
        System.out.println(conver);
        System.out.println(conver);
    }
}
