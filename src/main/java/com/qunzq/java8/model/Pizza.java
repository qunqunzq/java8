package com.qunzq.java8.model;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Qun on 2019-03-29.
 */
public abstract class Pizza {
    public enum Topping{
        HAM,MUSHROOM,ONION,PEPPER,SAUSGE
    }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();

    }
    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }
}
