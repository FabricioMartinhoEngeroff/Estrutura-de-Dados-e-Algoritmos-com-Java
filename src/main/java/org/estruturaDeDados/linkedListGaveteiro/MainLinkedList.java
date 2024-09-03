package org.estruturaDeDados.linkedListGaveteiro;

public class MainLinkedList {

    public static void main(String[] args) {
        Gaveteiro gaveteiro = new Gaveteiro();

        // Adicionando brinquedos
        gaveteiro.adicionarBrinquedo("Carrinho");
        gaveteiro.adicionarBrinquedo("Boneca");
        gaveteiro.adicionarBrinquedo("Bola");

        // Listando os brinquedos
        System.out.println("Brinquedos na gaveta:");
        gaveteiro.listarBrinquedos();

        // Adicionando brinquedo em uma posição específica
        gaveteiro.adicionarBrinquedo(1, "Quebra-cabeça");
        System.out.println("\nApós adicionar quebra-cabeça na posição 1:");
        gaveteiro.listarBrinquedos();

        // Removendo brinquedo pelo nome
        gaveteiro.removerBrinquedo("Bola");
        System.out.println("\nApós remover a Bola:");
        gaveteiro.listarBrinquedos();

        // Removendo brinquedo pela posição
        gaveteiro.removerBrinquedo(0);
        System.out.println("\nApós remover o brinquedo na posição 0:");
        gaveteiro.listarBrinquedos();

        // Verificando se um brinquedo existe
        System.out.println("\nGaveta contém 'Boneca'? " + gaveteiro.contemBrinquedo("Boneca"));
        System.out.println("Gaveta contém 'Bola'? " + gaveteiro.contemBrinquedo("Bola"));

        // Obtendo um brinquedo em uma posição específica
        System.out.println("\nBrinquedo na posição 1: " + gaveteiro.obterBrinquedo(1));

        // Mostrando quantidade de brinquedos
        System.out.println("\nQuantidade de brinquedos na gaveta: " + gaveteiro.quantidadeDeBrinquedos());

        // Limpando a gaveta
        gaveteiro.limparGaveta();
        System.out.println("\nApós limpar a gaveta:");
        gaveteiro.listarBrinquedos();
    }

}
