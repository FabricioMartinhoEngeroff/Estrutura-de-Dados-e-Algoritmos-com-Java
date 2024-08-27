package org.estruturaDeDados.pilha;

import org.estruturaDeDados.contatoVetor.Vetor;

public class PilhaTest {

    public static void main(String[] args) {
        // Cria um vetor com capacidade para 3 elementos
       Pilha<Integer> pilha = new Pilha<Integer>();


        System.out.println(pilha);
       System.out.println(pilha.estaVazia());

       pilha.empilhar(1);

        System.out.println(pilha.estaVazia());

    }
}