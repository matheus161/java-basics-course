package com.matheus161.javabasics.class42;

public class Test {
    public static void main(String[] args) {

        // Var não "final"
        System.out.println(Constants.URL_BLOG);
        Constants.URL_BLOG = "Chage var";
        System.out.println(Constants.URL_BLOG);

        // Var "final", don't allow changes
        // Constants.URL_BLOG = 'Test' // Error
        System.out.println(Constants.URL_BLOG);
    }
}
