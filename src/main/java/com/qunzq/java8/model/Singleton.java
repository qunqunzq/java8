package com.qunzq.java8.model;

/**
 * Created by Qun on 2019-04-03.单例模式
 */
public class Singleton {
    private String ap = "23";
    private static class HolderClass{
        private static final Singleton signleton = new Singleton();
    }
     public static Singleton getInstance(){
        return HolderClass.signleton;
    }

    public String getAp() {
        return ap;
    }
}
