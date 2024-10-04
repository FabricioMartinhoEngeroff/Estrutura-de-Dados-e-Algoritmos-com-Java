package org.estruturaDeDados.vetorUnidimensional.vetorInvertido;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[30]; // Vetor com 30 inteiros

        // Entrada dos números no vetor
        for (int i = 0; i < 30; i++) {
            System.out.print("Informe um número: ");
            num[i] = scanner.nextInt();
        }

        // Exibição dos números em ordem inversa
        System.out.println("Números em ordem inversa:");
        for (int i = 29; i >= 0; i--) {
            System.out.println(num[i]);
        }

        scanner.close();
    }

}
