package com.matheus161.javabasics.class38;

public class Professor extends Person {
    private String salary;
    private String className;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double calculateSalary() {
        return 0;
    }
}
