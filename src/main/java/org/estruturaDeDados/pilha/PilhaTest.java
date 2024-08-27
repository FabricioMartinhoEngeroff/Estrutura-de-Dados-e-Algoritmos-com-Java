package org.estruturaDeDados.pilha;

import org.estruturaDeDados.contatoVetor.Vetor;

public class PilhaTest {

    public static void main(String[] args) {

       Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha);
       System.out.println(pilha.estaVazia());

        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);

        System.out.println(pilha);

        System.out.println("Desempilhando elementos" + pilha.desempilhar());

        System.out.println(pilha);

        System.out.println(pilha.topo());
        System.out.println(pilha.estaVazia());


    }
}