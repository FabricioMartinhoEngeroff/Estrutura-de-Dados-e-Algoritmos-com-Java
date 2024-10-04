package org.estruturaDeDados.vetorMultidimencional.registroProfessor;

import java.util.Scanner;

public class RegistroProfessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Professor[] professores = new Professor[30];
        String resp = "sim";


        for (int i = 0; i < 30; i++) {
            System.out.print("Informe a matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Informe o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Informe a lotação: ");
            String lotacao = scanner.nextLine();

            System.out.print("Informe o salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();


            professores[i] = new Professor(matricula, nome, lotacao, salario);
            System.out.println();

            if (i < 29) {
                System.out.print("Deseja cadastrar outro professor? (sim/não): ");
                resp = scanner.nextLine();
                if (!resp.equalsIgnoreCase("sim")) {
                    break;
                }
            }
        }

        resp = "sim";
        while (resp.equalsIgnoreCase("sim")) {
            System.out.print("Informe a matrícula a ser pesquisada: ");
            int registro = scanner.nextInt();
            scanner.nextLine();

            boolean acha = false;
            int i = 0;

            while (i < professores.length && !acha) {
                if (professores[i] != null && professores[i].getMatricula() == registro) {
                    acha = true;
                } else {
                    i++;
                }
            }

            if (acha) {
                System.out.println("A lotação é: " + professores[i].getLotacao());
                System.out.println("O salário é: " + professores[i].getSalario());
            } else {
                System.out.println("Não há professor com a matrícula informada.");
            }

            System.out.print("Deseja continuar a pesquisa? (sim/não): ");
            resp = scanner.nextLine();
        }

        scanner.close();
    }
}
