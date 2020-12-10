package com.qunzq.java8;

import com.sun.jmx.snmp.internal.SnmpOutgoingRequest;

import java.time.*;
import java.time.temporal.ChronoField;

public class WaitJava implements Runnable{
    private final Object lock;

    public WaitJava(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println(Thread.currentThread().getName()+"开始进入");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"要结束啦");

        }
    }

    public static void main(String[] args) {

        LocalDate local  =  LocalDate.of(2020,8,9);
        LocalDate localDate =  LocalDate.now();

        int MONTH = localDate.get(ChronoField.MONTH_OF_YEAR);
        int DAY = localDate.get(ChronoField.DAY_OF_MONTH);


        LocalTime time = LocalTime.of(13, 45, 20);
        LocalTime now = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        LocalDate date = LocalDate.parse("2014-03-18");
        LocalTime time1 = LocalTime.parse("13:45:20");

        LocalDateTime localDateTime = LocalDateTime.of(2020,Month.MARCH,11,22,33);
        LocalDateTime dt2 = LocalDateTime.of(date, time1);
        LocalDate date1 = dt2.toLocalDate();
        LocalTime time2 = dt2.toLocalTime();

        //时间戳的转换
        long epochSecond = Instant.now().getEpochSecond();
        Instant instant = Instant.ofEpochSecond(epochSecond);
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant,ZoneOffset.of("+8"));

        //两个时间的差值
        LocalTime parse = LocalTime.parse("09:09:09");
        LocalTime now3 = LocalTime.now();
        long seconds = Duration.between(parse, now3).getSeconds();



        System.out.println(epochSecond);
        System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")));
        System.out.println(LocalDateTime.now());
        System.out.println(localDateTime1);


    }
}
