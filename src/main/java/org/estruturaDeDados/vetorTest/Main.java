package org.estruturaDeDados.vetorTest;

import org.estruturaDeDados.contatoVetor.Vetor;

public class Main {

    public static void main(String[] args) {
        // Cria um vetor com capacidade para 3 elementos
        Vetor vetor = new Vetor(6);

        // Adiciona elementos ao vetor nas posições apropriadas
        vetor.adiciona(0, "B");
        vetor.adiciona(1, "C");
        vetor.adiciona(2, "D");
        vetor.adiciona(3, "F");
        vetor.adiciona(4, "G");

        // Exibe o conteúdo do vetor
        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

    }
}