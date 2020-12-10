package com.qunzq.java8.dao;

import com.qunzq.java8.impl.GreenAppleFilter;
import com.qunzq.java8.inferface.AppleFiter;
import com.qunzq.java8.inferface.Converter;
import com.qunzq.java8.model.Car;
import org.springframework.format.annotation.DateTimeFormat;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Handler;
import java.util.stream.Collectors;

/**
 * Created by Qun on 2019-05-17.
 */
public class AppleDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        SplittableRandom splittableRandom = new SplittableRandom();
         List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        List<Integer> l3 = new ArrayList<Integer>();
        for (int a =0 ;a<10000 ;a++) {
            int randomWithSplittableRandom = ThreadLocalRandom.current().nextInt(1, 4);
            if (randomWithSplittableRandom == 1){
                l1.add(randomWithSplittableRandom);
            }
            if (randomWithSplittableRandom == 2){
                l2.add(randomWithSplittableRandom);
            }
            if (randomWithSplittableRandom == 3){
                l3.add(randomWithSplittableRandom);
            }
            System.out.println("split" + randomWithSplittableRandom);
            //System.out.println("Thread" + ThreadLocalRandom.current().nextInt(1, 4));
        }
        System.out.println(l1.size());
        System.out.println(l2.size());
        System.out.println(l3.size());
    }
}