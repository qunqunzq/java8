package com.qunzq.java8.inferface;

/**
 * Created by Qun on 2019-05-17.
 * 函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
 *
 * 函数式接口里是可以包含Object里的public方法，这些方法对于函数式接口来说，不被当成是抽象方法（虽然它们是抽象方法）；
 * 因为任何一个函数式接口的实现，默认都继承了 Object 类，包含了来自 java.lang.Object 里对这些抽象方法的实现；
 */
@FunctionalInterface
public interface Converter<F,T> {
    T conver(F from);

    boolean equals(Object obj);
}
