package org.estruturaDeDados.pilha;

import org.estruturaDeDados.contatoVetor.Vetor;

public class PilhaTest {

    public static void main(String[] args) {

       Pilha<Integer> pilha = new Pilha<Integer>();

       pilha.empilhar(1);
       pilha.empilhar(2);

        System.out.println(pilha);

        System.out.println(pilha.topo());
       System.out.println(pilha.estaVazia());

    }
}