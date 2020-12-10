package com.qunzq.java8.dao;

public class NuTest {
    private final String name;
    private final int age;
    private final int size;
    private final String city;

    public static class  Builder{
        private   String name;
        private   int age;
        private   int size =0;
        private   String city = "北京";

        public Builder age(int  age){
            this.age = age;
            return this;
        }
        public Builder name(String  name){
            this.name = name;
            return this;
        }
        public Builder size(int size){
            this.size = size;
            return this;
        }
        public Builder city(String  city){
            this.city = city;
            return this;
        }
        public NuTest build(){
            return new NuTest(this);
        }
    }

    private NuTest(Builder build){
        this.age = build.age;
        this.city = build.city;
        this.name = build.name;
        this.size = build.size;
    }

    @Override
    public String toString() {
        return "NuTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", city='" + city + '\'' +
                '}';
    }
}
