package com.matheus161.javabasics.class34.labs.Exerc01;

public class Main {
    public static void main(String[] args) {
        Count.incrementCount();
        Count.incrementCount();
        Count.decrementCount();

        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        System.out.println(Count.getCount());
    }
}
