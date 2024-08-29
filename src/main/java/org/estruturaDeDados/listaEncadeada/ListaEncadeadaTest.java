package org.estruturaDeDados.listaEncadeada;

public class ListaEncadeadaTest {

    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);

        System.out.println(lista.getTamanho());
        System.out.println(lista);

    }
}
