package org.estruturaDeDados.listaEncadeada;

public class ListaEncadeadaTest {

    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);



        System.out.println("Tamanho " + lista.getTamanho());
        System.out.println(lista);

        System.out.println("Busca por elemento");
        System.out.println(lista.buscar(1));
        System.out.println(lista.buscar(2));
        System.out.println(lista.buscar(3));


        System.out.println("Busca por Posição");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        System.out.println(lista.buscaPorPosicao(-1));

    }
}
