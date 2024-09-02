package org.estruturaDeDados.listaEncadeada;

public class ListaEncadeadaTest {

    public static void main(String[] args) {
        // adicionaPosicao();
//        removeInicio();
        removeFinal();
    }

//    public static void adicionaPosicao() {
//        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
//
//        lista.adicionaQualquerPosicao(0, 1);
//        lista.adicionaQualquerPosicao(1, 2);
//        lista.adicionaQualquerPosicao(2, 4);
//        System.out.println(lista);
//
//        lista.adicionaQualquerPosicao(0, 0);
//        lista.adicionaQualquerPosicao(4, 5);
//        System.out.println(lista);
//        lista.adicionaQualquerPosicao(2, 3);
//        System.out.println(lista);
//    }

//    public static void removeInicio() {
//        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
//
//        lista.adiciona(1);
//        lista.adiciona(2);
//        lista.adiciona(4);
//        lista.adiciona(5);
//
//        System.out.println("Elemento removido " + lista.removeInicio());
//
//        System.out.println(lista);
//    }

    public static void removeFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);
        lista.adiciona(5);

        System.out.println("Elemento removido " + lista.removeFinal());
        System.out.println(lista);


        System.out.println("Elemento removido " + lista.removeFinal());
        System.out.println(lista);


        System.out.println("Elemento removido " + lista.removeFinal());
        System.out.println(lista);

        System.out.println("Elemento removido " + lista.removeFinal());
        System.out.println(lista);
    }
}


