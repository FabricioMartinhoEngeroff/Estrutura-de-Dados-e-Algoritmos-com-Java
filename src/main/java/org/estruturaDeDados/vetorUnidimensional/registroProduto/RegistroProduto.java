package org.estruturaDeDados.vetorUnidimensional.registroProduto;

import java.util.Scanner;

public class RegistroProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadProduto[] produto = new CadProduto[10];  // Vetor de 10 produtos
        String resp = "sim";
        boolean acha;
        int codigo, i;

        for (i = 0; i < 10; i++) {
            produto[i] = new CadProduto();
            System.out.println("Informe código do produto:");
            produto[i].setCodigo(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Informe a descrição do produto:");
            produto[i].setNome(scanner.nextLine());
            System.out.println("Informe o preço do produto:");
            produto[i].setPreco(scanner.nextDouble());
            System.out.println("Informe o saldo em estoque do produto:");
            produto[i].setSaldo(scanner.nextInt());
        }

        while (resp.equalsIgnoreCase("sim")) {
            System.out.println("Informe o código a ser pesquisado:");
            codigo = scanner.nextInt();
            i = 0;
            acha = false;

            while (i < 10 && !acha) {
                if (produto[i].getCodigo() == codigo) {
                    acha = true;
                } else {
                    i++;
                }
            }

            if (acha) {
                System.out.println("O preço é: " + produto[i].getPreco());
                System.out.println("O saldo em estoque é: " + produto[i].getSaldo());
            } else {
                System.out.println("Não há produto com o código informado");
            }

            System.out.println("Deseja continuar a pesquisa? (sim/não)");
            scanner.nextLine();
            resp = scanner.nextLine();
        }

        scanner.close();
    }
}
