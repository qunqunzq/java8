package com.qunzq.java8;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class Syn implements Runnable{
    private static int a;
    static  final Object o1 = new Object();
    static final Object o2 = new Object();
    public static void main(String[] args) throws InterruptedException {
        Syn syn = new Syn();
        Syn syn1= new Syn();
        Thread thread = new Thread(syn);
        thread.setName("jd");
        Thread thread1 =new Thread(syn1);
        thread.start();
        thread1.start();
        System.out.println(a);
       Callable<Integer> dd=()->{
            return 1;
        };
        Callable callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        };


    }

    @Override
    public void  run() {
        dd();
    }
    public static synchronized void dd(){

        System.out.println(Thread.currentThread().getName()+"==1拿到了");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"==1释放了");

    }
}
