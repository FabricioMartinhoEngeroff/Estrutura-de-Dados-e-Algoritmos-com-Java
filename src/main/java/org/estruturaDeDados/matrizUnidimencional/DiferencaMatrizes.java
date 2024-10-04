package org.estruturaDeDados.matrizUnidimencional;

import java.util.Scanner;


public class DiferencaMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] C = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Informe o elemento A[" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Informe o elemento B[" + (i + 1) + "][" + (j + 1) + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("Matriz C (Diferença entre A e B):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


