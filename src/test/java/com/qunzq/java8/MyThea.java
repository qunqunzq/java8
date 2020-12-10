package com.qunzq.java8;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MyThea {
    public static void main(String[] args) throws InterruptedException {
        FixTher fixTher = new FixTher(new AtomicInteger(1000));
        ExecutorService executorService = Executors.newFixedThreadPool(4);
            IntStream.range(0,4).forEach(i -> {
                executorService.submit(fixTher);
                executorService.shutdownNow();
            });

        executorService.shutdown();


    }
    static class FixTher implements Runnable{

        private AtomicInteger i = new AtomicInteger();

        public AtomicInteger getI() {
            return i;
        }

        public void setI(AtomicInteger i) {
            this.i = i;
        }

        public FixTher(AtomicInteger i) {
            this.i = i;
        }

        @Override
        public void run() {

            IntStream.range(0,100).forEach(i1 -> {
                i.decrementAndGet();
                try {
                Thread.sleep(122);
                } catch (InterruptedException e) {

                    System.out.println("线程响应中断");
                }
            });



            System.out.println(i);
        }
    }

}
