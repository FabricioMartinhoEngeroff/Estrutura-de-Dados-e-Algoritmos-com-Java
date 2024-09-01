package org.estruturaDeDados.listaEncadeada;

public class ListaEncadeadaTest {

    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Lista: " + lista);

        System.out.println("Busca por elemento:");
        System.out.println("Elemento 1: " + lista.buscar(1));
        System.out.println("Elemento 2: " + lista.buscar(2));
        System.out.println("Elemento 3: " + lista.buscar(3));

        System.out.println("Busca por Posição:");
        System.out.println("Posição 0: " + lista.buscaPorPosicao(0));
        System.out.println("Posição 1: " + lista.buscaPorPosicao(1));
        System.out.println("Posição 2: " + lista.buscaPorPosicao(2));
        System.out.println("Posição -1 (inválida): " + lista.buscaPorPosicao(-1));

        // Testando o método adicionaQualquerPosicao
        System.out.println("\nAdicionando elemento na posição intermediária:");
        lista.adicionaQualquerPosicao(1, 5); // Deve adicionar 5 entre 1 e 2

        System.out.println("Lista após adicionar 5 na posição 1: " + lista);
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Elemento na posição 1 (esperado 5): " + lista.buscaPorPosicao(1));

        System.out.println("\nAdicionando elemento na primeira posição:");
        lista.adicionaQualquerPosicao(0, 0); // Deve adicionar 0 no início da lista

        System.out.println("Lista após adicionar 0 na posição 0: " + lista);
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Elemento na posição 0 (esperado 0): " + lista.buscaPorPosicao(0));

        System.out.println("\nAdicionando elemento na última posição:");
        lista.adicionaQualquerPosicao(lista.getTamanho(), 6); // Deve adicionar 6 no final da lista

        System.out.println("Lista após adicionar 6 na última posição: " + lista);
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Elemento na última posição (esperado 6): " + lista.buscaPorPosicao(lista.getTamanho() - 1));
    }
}