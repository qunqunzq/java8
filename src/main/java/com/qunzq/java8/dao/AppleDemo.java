package com.qunzq.java8.dao;

import com.qunzq.java8.impl.GreenAppleFilter;
import com.qunzq.java8.inferface.AppleFiter;
import com.qunzq.java8.inferface.Converter;
import com.qunzq.java8.model.Apple;
import com.qunzq.java8.model.Car;
import com.qunzq.java8.model.Person;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Qun on 2019-05-17.
 */
public class AppleDemo {

    public static void main(String[] args) {
      /*  AppleFiter greenAppleFilter = new GreenAppleFilter();
        System.out.println(greenAppleFilter.sqrt(16));*/
    /*  int i = 1;
        Converter<String,Integer>  converter = from -> {
            return Integer.valueOf(from) + i;
        };
        Integer conver = converter.conver("2");
        System.out.println(conver);*/

        collect();

    }
    //Predicate 断言
    public static void predicatePlay(){
        Predicate<String> pp = (s) -> s.length() > 0;

        System.out.println(pp.test("ddd"));

        Function<String,Integer> function =  s -> Integer.parseInt(s);
        Integer apply = function.apply("3");
        System.out.println(apply);
    }
    //Filter 过滤
    public static void filterPlay(){
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        Stream<String> a = stringCollection.stream().filter(s -> s.startsWith("a")).map(s -> s = s + "+");
        System.out.println(a.toArray().toString());
    }
    public static void streamPlay(){
        //IntStream.range(1,4).forEach(System.out::println);
       // Stream.of("a1","a2","a3").forEach(i->i.substring(1));
        Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
            System.out.println(s);
            return true;
        }).forEach(s -> {
            System.out.println(s+"=============");
        });
    }

    public static void collect() {
        List<Person> persons =
                Arrays.asList(
                        new Person("Max", 18),
                        new Person("Peter", 23),
                        new Person("Pamela", 23),
                        new Person("Pamela1111", 23),
                        new Person("Pamela1112", 23),
                        new Person("David", 12));
       /* List<Person> p = persons.stream().filter(s -> {
           if( s.name.startsWith("P")) {
               return true;
           }else {
               return false;
           }
        }).collect(Collectors.toList());
        System.out.println(p);*/
      /* Map<Integer,List<Person>> map = persons.stream().collect(Collectors.groupingBy(p->p.age));

        map.forEach((age,p)-> System.out.println("age"+age+"pp+++"+p));*/
       /* String allName = persons.stream().filter(p -> p.age >= 18).map(p -> p.name)
                .collect(Collectors.joining(" and ", "开始啦 ", " 结束啦"));
        System.out.println(allName);*/
     /*  Map<Integer,String> map = persons.stream().collect(Collectors.toMap(p->p.age,p->p.name,(name1,name2)->name1+";"+name2));
        System.out.println(map);*/
        List<Person> collect = persons.stream().filter(person -> person.age > 23).collect(Collectors.toList());
        System.out.println(collect);

    }

    public static void ofNullable(){
      /*  Person p = new Person("max",18);
        Optional<String> s = Optional.ofNullable(p).map(a -> a.name);
        System.out.println(s.isPresent());*/
        Car car = new Car();
        Optional<String> s = Optional.ofNullable(car).map(p -> p.getApple()).map(Apple::getColor);
        System.out.println(s.isPresent());

    }
}
