package org.estruturaDeDados.vetorUnidimensional.agenda;

import java.util.Scanner;

class CadAgenda {
    String nome;
    String fone;
    String email;
}

public class Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadAgenda[] contato = new CadAgenda[20];
        String nomeBusca;
        String resp = "sim";
        boolean acha;

        for (int i = 0; i < 20; i++) {
            contato[i] = new CadAgenda();
            System.out.print("Informe o nome do contato: ");
            contato[i].nome = scanner.nextLine();
            System.out.print("Informe o telefone: ");
            contato[i].fone = scanner.nextLine();
            System.out.print("Informe o e-mail: ");
            contato[i].email = scanner.nextLine();
        }

        while (resp.equalsIgnoreCase("sim")) {
            System.out.print("Informe o nome a ser pesquisado: ");
            nomeBusca = scanner.nextLine();
            int i = 0;
            acha = false;

            while (i < 20 && !acha) {
                if (contato[i].nome.equalsIgnoreCase(nomeBusca)) {
                    acha = true;
                } else {
                    i++;
                }
            }

            if (acha) {
                System.out.println("O fone é: " + contato[i].fone);
            } else {
                System.out.println("Não há contato com o nome informado.");
            }

            System.out.print("Deseja continuar a pesquisa? (sim/não): ");
            resp = scanner.nextLine();
        }

        scanner.close();
    }
}
