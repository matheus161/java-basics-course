package com.matheus161.javabasics.class34.labs.Exerc01;

public class Count {
    private static int count;

    public Count() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    private static void setCount(int count) {
        Count.count = count;
    }

    public static void incrementCount() {
        setCount(Count.getCount() + 1);
    }

    public static void decrementCount() {
        setCount(Count.getCount() - 1);
    }
}
