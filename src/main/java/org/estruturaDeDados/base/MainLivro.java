package org.estruturaDeDados.base;

public class MainLivro {

    public static void main(String[] args) {

        EstruturaEstatica<String> livros = new EstruturaEstatica<>(5);

        livros.adiciona("O Senhor dos Anéis");
        livros.adiciona("O Hobbit");
        livros.adiciona("Dom Quixote");
        livros.adiciona("A Odisséia");
        livros.adiciona("Moby Dick");

        System.out.println("Livros na estante: " + livros);

        livros.adiciona(2, "Guerra e Paz");

        System.out.println("Livros na estante após inserção: " + livros);

        System.out.println("A estante está vazia? " + (livros.estaVazia() ? "Sim" : "Não"));

        livros.adiciona("1984");

        System.out.println("Livros na estante após aumento de capacidade: " + livros);

        System.out.println("Quantidade de livros na estante: " + livros.tamanho());
    }

}
