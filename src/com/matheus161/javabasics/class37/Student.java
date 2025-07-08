package com.matheus161.javabasics.class37;

public class Student extends Person {
    private String className;
    private double[] grades;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        return 0;
    }

    public boolean verifyApproved() {
        return true;
    }
}
