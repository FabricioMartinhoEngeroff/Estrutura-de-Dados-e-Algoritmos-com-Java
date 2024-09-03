package org.estruturaDeDados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class ManQueue {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        System.out.println("Fila após enfileirar elementos: " + fila);

        Integer elementoEspiado = fila.peek();
        System.out.println("Elemento espiado: " + elementoEspiado);

        Integer elementoRemovido = fila.poll();
        System.out.println("Elemento removido: " + elementoRemovido);
        System.out.println("Fila após desinfileirar: " + fila);

        System.out.println("A fila está vazia? " + fila.isEmpty());

        fila.poll();
        fila.poll();
        System.out.println("Fila após remover todos os elementos: " + fila);

        System.out.println("A fila está vazia? " + fila.isEmpty());

        fila.add(10);
        fila.add(20);
        System.out.println("Tamanho da fila: " + fila.size());

        for (int i = 0; i < 20; i++) {
            fila.add(i + 1);
        }
        System.out.println("Fila após enfileirar 20 elementos: " + fila);
        System.out.println("Tamanho da fila após enfileirar 20 elementos: " + fila.size());


        System.out.println("Fila final: " + fila);
    }

}
