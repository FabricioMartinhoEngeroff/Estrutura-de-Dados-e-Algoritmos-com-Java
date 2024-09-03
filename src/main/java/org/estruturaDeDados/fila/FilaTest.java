package org.estruturaDeDados.fila;

public class FilaTest {


    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.println("Fila após enfileirar elementos: " + fila);

        Integer elementoEspiado = fila.espiar();
        System.out.println("Elemento espiado: " + elementoEspiado);

        Integer elementoRemovido = fila.desinfileirar();
        System.out.println("Elemento removido: " + elementoRemovido);
        System.out.println("Fila após desinfileirar: " + fila);

        System.out.println("A fila está vazia? " + fila.estaVazia());

        fila.desinfileirar();
        fila.desinfileirar();
        System.out.println("Fila após remover todos os elementos: " + fila);


        System.out.println("A fila está vazia? " + fila.estaVazia());


        fila.enfileirar(10);
        fila.enfileirar(20);
        System.out.println("Tamanho da fila: " + fila.tamanho());


        for (int i = 0; i < 20; i++) {
            fila.enfileirar(i + 1);
        }
        System.out.println("Fila após enfileirar 20 elementos: " + fila);
        System.out.println("Tamanho da fila após enfileirar 20 elementos: " + fila.tamanho());


        System.out.println("Fila final: " + fila);
    }
}


