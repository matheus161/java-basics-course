package com.matheus161.javabasics.class20.labs;

import java.util.Scanner;

public class Exerc06 {
    static void printActualResult(char[][] chess) {
        System.out.println("-------------");
        for (int i = 0; i < chess.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static boolean isOutOfBounds(char[][] chess, int i, int j) {
        return i < 0 || i >= chess.length || j < 0 || j >= chess[i].length;
    }

    static boolean checkInLineSequence(char[][] chess) {
        for (char[] chars : chess) {
            char valueColumn0 = chars[0];
            char valueColumn1 = chars[1];
            char valueColumn2 = chars[2];

            if (valueColumn0 != '\u0000' && valueColumn0 == valueColumn1 && valueColumn1 == valueColumn2) {
                return true;
            }

        }

        return false;
    }

    static boolean checkColumnSequence(char[][] chess) {
        for (int col = 0; col < chess[0].length; col++) {
            char a = chess[0][col];
            char b = chess[1][col];
            char c = chess[2][col];

            if (a != '\u0000' && a == b && b == c) {
                return true;
            }
        }

        return false;
    }

    static boolean checkDiagonalSequence (char[][] chess) {
        char center = chess[1][1];

        // Diagonal principal
        if (center != '\u0000' && chess[0][0] == center && chess[2][2] == center) {
            return true;
        }

        // Diagonal secundária
        if (center != '\u0000' && chess[0][2] == center && chess[2][0] == center) {
            return true;
        }

        return false;
    }

    static boolean hasWinner(char[][] chess) {
        return checkInLineSequence(chess) ||
                checkColumnSequence(chess) ||
                checkDiagonalSequence(chess);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chess = new char[3][3];
        int chessSize = chess.length * chess[0].length;
        int plays = 0;
        int x, y;

        do {
            boolean isOddPlay = plays % 2 == 0;
            int actualPlayer = isOddPlay ? 1 : 2;
            char symbol = isOddPlay ? 'O' : 'X';

            System.out.print("Jogador " + actualPlayer  + ": Digite a posição (x, y): ");
            x = scanner.nextInt();
            y = scanner.nextInt();

            // Fixing the index with 0 base
            int row = x - 1;
            int col = y - 1;

            if (isOutOfBounds(chess, row, col)) {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }

            if (chess[row][col] != '\u0000') {
                System.out.println("Essa posição já está ocupada! Tente novamente.");
                continue;
            }

            chess[row][col] = symbol;
            printActualResult(chess);
            if (hasWinner(chess)) {
                System.out.println("Jogador " + actualPlayer + " venceu. ");
                break;
            }

            plays++;
        } while (plays < chessSize);
    }
}
