package org.estruturaDeDados.vetorMultidimencional.livro;

import java.util.Scanner;

class CadLivro {
    int id;
    String titulo;
    String autor;
    double preco;
}

public class RegistroLivros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadLivro[] livros = new CadLivro[30];

        for (int i = 0; i < livros.length; i++) {
            livros[i] = new CadLivro();
        }

        for (int i = 0; i < 30; i++) {
            System.out.println("Informe o ID do livro " + (i + 1) + ":");
            livros[i].id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe o título do livro:");
            livros[i].titulo = scanner.nextLine();
            System.out.println("Informe o autor do livro:");
            livros[i].autor = scanner.nextLine();
            System.out.println("Informe o preço do livro:");
            livros[i].preco = scanner.nextDouble();
        }

        String resp = "sim";
        while (resp.equals("sim")) {
            System.out.println("Informe o ID do livro a ser pesquisado:");
            int idBusca = scanner.nextInt();
            boolean encontrado = false;
            for (int i = 0; i < 30; i++) {
                if (livros[i].id == idBusca) {
                    System.out.println("Título: " + livros[i].titulo);
                    System.out.println("Autor: " + livros[i].autor);
                    System.out.println("Preço: " + livros[i].preco);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Livro não encontrado com o ID informado.");
            }
            System.out.println("Deseja continuar a pesquisa? (sim/não)");
            resp = scanner.next();
        }

        scanner.close();
    }
}
