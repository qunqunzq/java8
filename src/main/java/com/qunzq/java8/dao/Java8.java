package com.qunzq.java8.dao;

import com.qunzq.java8.model.Car;
import net.sf.json.JSONObject;
import org.w3c.dom.ls.LSException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Java8 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        Car car= new Car();
        car.setName("baoma");
        car.setName("haha");
        car.setName("haha");
        list.add(car);
        String.valueOf(1);
        BigInteger bigInteger = new BigInteger("2");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("count",list);
        System.out.println(jsonObject.toString());
        System.out.println("2222222");

    }
}
