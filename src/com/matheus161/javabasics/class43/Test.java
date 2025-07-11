package com.matheus161.javabasics.class43;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.setClassName("Computer Science");
        double[] grades = {10, 9, 9};
        student.setGrades(grades);

        // Prints the pointer address
        System.out.println(student);

        String s1 = "a";
        String s2 = "a";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s1));

        Student student2 = new Student();
        student2.setClassName("Computer Science");
        double[] grades2 = {10, 9, 9};
        student2.setGrades(grades2);

        // Comparing references
        System.out.println(student == student2);

        // Comparing objects
        // Equals compare attributes
        System.out.println(student.equals(student2));
    }
}
