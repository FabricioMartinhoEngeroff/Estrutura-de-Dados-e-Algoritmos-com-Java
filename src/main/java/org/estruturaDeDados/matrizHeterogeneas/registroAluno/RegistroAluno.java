package org.estruturaDeDados.matrizHeterogeneas.registroAluno;

import java.util.Scanner;

public class RegistroAluno {

    static class CadAluno {
        String nome;
        double[] notas = new double[4];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadAluno[] alunos = new CadAluno[10];

        for (int i = 0; i < 10; i++) {
            alunos[i] = new CadAluno();
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            alunos[i].nome = scanner.nextLine();


            for (int j = 0; j < 4; j++) {
                System.out.print("Informe a nota " + (j + 1) + " do aluno " + alunos[i].nome + ": ");
                alunos[i].notas[j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }

        System.out.println("\n--- Exibindo os dados dos alunos ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno: " + alunos[i].nome);
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota " + (j + 1) + ": " + alunos[i].notas[j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}

