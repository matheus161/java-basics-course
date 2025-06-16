package com.matheus161.javabasics.class19.labs;

public class Exerc31 {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; //pares e impares

        for (int i=0; i<vetorA.length; i++){
            int number = i + 1;
            System.out.println("Entre com o valor da posição A - " + number);
            vetorA[i] = number;
        }

        int posB = 0;
        int posC = 0;

        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for (int i=0; i<posB; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println();
    }
}
