package com.qunzq.java8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class ThreadLocalDate {
    public static void main(String[] args) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1000);
        ExecutorService executorService =  new ThreadPoolExecutor(5,10,1000, TimeUnit.SECONDS,arrayBlockingQueue);
        ThreadLocalSimp threadLocalSimp = new ThreadLocalSimp("hahah");
        for(int i = 0;i<1000;i++){
            int finalI = i;
            executorService.submit(()->{
                 
                  new ThreadLocalSimp("hahah"+finalI);

                 System.out.println(ThreadLocalSimp.getThreadLocal().get());
            });
        }
        System.out.println("+++++++"+ThreadLocalSimp.getThreadLocal().get());
        executorService.shutdown();
    }




}
class ThreadLocalSimp {

    private String name ;

    public static   ThreadLocal<String> threadLocal;

    public static ThreadLocal<String> getThreadLocal() {
        return threadLocal;
    }

    public static void setThreadLocal(ThreadLocal<String> threadLocal) {
        ThreadLocalSimp.threadLocal = threadLocal;
    }

    public ThreadLocalSimp() {

    }

    public ThreadLocalSimp(String name) {
        this.name = name;
        threadLocal = new ThreadLocal<>();
        threadLocal.set(name);
    }
}