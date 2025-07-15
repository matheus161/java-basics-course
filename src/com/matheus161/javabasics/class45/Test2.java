package com.matheus161.javabasics.class45;

public class Test2 {
    public static void main(String[] args) {

        Object object1 = obterString();
        String s1 = (String) object1;

        Object object2 = "Minha string";
        String s2 = (String) object2;

        Object object3 = new Object();
        String s3 = (String) object3;

        Object object4 = obterInt();
        String s4 = (String) object4;
    }

    public static String obterString() {
        return "Minha string";
    }

    public static int obterInt() {
        return 1;
    }
}
