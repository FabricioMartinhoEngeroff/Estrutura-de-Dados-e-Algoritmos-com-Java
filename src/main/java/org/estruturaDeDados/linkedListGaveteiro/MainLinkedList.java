package org.estruturaDeDados.linkedListGaveteiro;

public class MainLinkedList {

    public static void main(String[] args) {
        Gaveteiro gaveteiro = new Gaveteiro();

        gaveteiro.adicionarBrinquedo("Carrinho");
        gaveteiro.adicionarBrinquedo("Boneca");
        gaveteiro.adicionarBrinquedo("Bola");

        System.out.println("Brinquedos na gaveta:");
        gaveteiro.listarBrinquedos();

        gaveteiro.adicionarBrinquedo(1, "Quebra-cabeça");
        System.out.println("\nApós adicionar quebra-cabeça na posição 1:");
        gaveteiro.listarBrinquedos();

        gaveteiro.removerBrinquedo("Bola");
        System.out.println("\nApós remover a Bola:");
        gaveteiro.listarBrinquedos();

        gaveteiro.removerBrinquedo(0);
        System.out.println("\nApós remover o brinquedo na posição 0:");
        gaveteiro.listarBrinquedos();

        System.out.println("\nGaveta contém 'Boneca'? " + gaveteiro.contemBrinquedo("Boneca"));
        System.out.println("Gaveta contém 'Bola'? " + gaveteiro.contemBrinquedo("Bola"));

        System.out.println("\nBrinquedo na posição 1: " + gaveteiro.obterBrinquedo(1));

        System.out.println("\nQuantidade de brinquedos na gaveta: " + gaveteiro.quantidadeDeBrinquedos());

        gaveteiro.limparGaveta();
        System.out.println("\nApós limpar a gaveta:");
        gaveteiro.listarBrinquedos();
    }

}
