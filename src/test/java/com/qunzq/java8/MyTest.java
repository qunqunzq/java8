package com.qunzq.java8;

import net.sf.json.JSONObject;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyTest {

    private static ReentrantReadWriteLock reentrantReadWriteLock =  new ReentrantReadWriteLock();

    private static ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();

    private static ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

    private static volatile  int aa =0;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list =  new ArrayList();
        String data  = "{\n" +
                "\t\"ownerCode\": \"8800132922\",\n" +
                "\t\"billSn\": \"WD222222231\",\n" +
                "\t\"billDate\": \"2020-07-08\",\n" +
                "\t\"billTime\": \"09:09:09\",\n" +
                "\t\"items\": [{\n" +
                "\t\t\"onlineSn\": \"wd11111113\",\n" +
                "\t\t\"whCode\":\"JOX1\",\n" +
                "\t\t\"suiteFlag\": \"0\",\n" +
                "\t\t\"prodCode\": \"BH032207H\",\n" +
                "\t\t\"prodNumber\": \"1\",\n" +
                "\t\t\"prodPrice\": \"2\",\n" +
                "\t\t\"prodMoney\": \"3\"\n" +
                "\t}]}";
        JSONObject returnJson=new JSONObject();
        JSONObject jsonObject = JSONObject.fromObject(data);
        String billTime = jsonObject.get("billTime").toString();
        LocalTime parse = LocalTime.parse("10:35:00");
        LocalTime parse1 = LocalTime.parse("10:35:00");
        LocalTime now = LocalTime.now();
        long between = ChronoUnit.SECONDS.between(parse, now);
        Duration between1 = Duration.between(parse, parse1);
        System.out.println(between);
        System.out.println(between1.getSeconds());


    }
    public static void add(){
        IntStream.range(0,10000).forEach(i -> aa++);

    }

    public static void read(){
        System.out.println(Thread.currentThread().getName()+"尝试获得读锁");
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"获得了读锁");
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+"读完了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName()+"释放了读锁");
            readLock.unlock();
        }

    }

    public static void writ(){
        System.out.println(Thread.currentThread().getName()+"尝试获得写锁");
        writeLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"获得了写锁");
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+"写完了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName()+"释放了写锁");
            writeLock.unlock();
        }

    }




    static class Produce implements Runnable {

        private AtomicInteger i = new AtomicInteger();

        public AtomicInteger getI() {
            return i;
        }

        @Override
        public void run() {
           for (int j = 0;j<10000;j++){
                i.addAndGet(1);
           }
        }
    }
}

class Point {

    private Lock lock = new ReentrantLock(false);

    public void point(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"开始打印1");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"打印完毕1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+"开始打印2");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"打印完毕2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}