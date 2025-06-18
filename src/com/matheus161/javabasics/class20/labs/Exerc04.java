package com.matheus161.javabasics.class20.labs;

import java.util.Map;
import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        String[][] commitments = new String[31][24];
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> daysOfWeek = Map.of(
                1, "Segunda",
                2, "Terça",
                3, "Quarta",
                4, "Quinta",
                5, "Sexta",
                6, "Sábado",
                7, "Domingo"
        );
        int option;

        do {
            System.out.println("===================================");
            System.out.println("         MENU DE OPÇÕES           ");
            System.out.println("===================================");
            System.out.println("1 - Cadastrar compromisso");
            System.out.println("2 - Excluir compromisso");
            System.out.println("3 - Consultar agenda geral");
            System.out.println("0 - Sair");
            System.out.println("===================================");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o dia: ");
                    int day = scanner.nextInt();

                    System.out.print("Digite a hora: ");
                    int hour = scanner.nextInt();

                    commitments[day - 1][hour - 1] = "X";
                    break;
                case 2:
                    System.out.print("Digite o dia: ");
                    int dayToExclude = scanner.nextInt();

                    System.out.print("Digite a hora: ");
                    int hourToExclude = scanner.nextInt();

                    commitments[dayToExclude - 1][hourToExclude - 1] = "-";
                    break;
                case 3:
                    System.out.print("H   ");
                    for (int dia = 0; dia < commitments.length; dia++) {
                        System.out.print((dia + 1) + "\t");
                    }
                    System.out.println();

                    for (int hora = 0; hora < commitments[0].length; hora++) {
                        System.out.print((hora + 1) + "\t");  // Mostra horas de 1 até 24
                        for (int dia = 0; dia < commitments.length; dia++) {
                            String compromisso = commitments[dia][hora];
                            if (compromisso == null) {
                                System.out.print("-\t");
                            } else {
                                System.out.print(compromisso + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.print("Encerrando o programa...");
                    break;
                default:
                    System.out.print("Opção inválida! Tente novamente.");
            }
        } while (option != 0);
    }
}
