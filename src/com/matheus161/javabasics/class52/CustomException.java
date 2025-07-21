package com.matheus161.javabasics.class52;

public class CustomException {
    public static void main(String[] args) {
        try {
            teste();
        } catch (NotExactDivision e) {
            e.printStackTrace();
        }
    }

    public static void teste() throws NotExactDivision {
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] demon = {2, 0, 4, 8, 0, 2, 4};

        for (int i=0; i<numeros.length; i++) {
            try{
                if (numeros[i] % 2 != 0){
                    //lançar a exception aqui
                    throw new NotExactDivision(numeros[i], demon[i]);
                }
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | NotExactDivision e){
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }
        }
    }
}
