package com.matheus161.javabasics.class10;

public class Variables {
    public static void main (String[] args){

        // Java convention
        int age = 23;
        String name = "Matheus";
        String petName = "Doguinho";
        String ano2025 = "2025";

        // Correct, but no used
        int _age;
        int $age;


        // Not a Java convention
        String my_dog_name;
        String MyDogName;
        String myDogname;

        age = 25;

        System.out.println("Idade = " + age);
        System.out.println("Nome = " + name);

        // Bad practices, variables using confusing names
        int a = 10;
        String b = "Matheus";
    }
}
