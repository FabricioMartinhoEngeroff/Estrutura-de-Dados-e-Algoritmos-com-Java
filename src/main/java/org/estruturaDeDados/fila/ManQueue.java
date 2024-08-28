package org.estruturaDeDados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class ManQueue {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        // Teste do método enfileirar (add no LinkedList)
        fila.add(1);
        fila.add(2);
        fila.add(3);
        System.out.println("Fila após enfileirar elementos: " + fila);

        // Teste do método espiar (peek no LinkedList)
        Integer elementoEspiado = fila.peek();
        System.out.println("Elemento espiado: " + elementoEspiado);

        // Teste do método desinfileirar (poll no LinkedList)
        Integer elementoRemovido = fila.poll();
        System.out.println("Elemento removido: " + elementoRemovido);
        System.out.println("Fila após desinfileirar: " + fila);

        // Teste do método estaVazia (isEmpty no LinkedList)
        System.out.println("A fila está vazia? " + fila.isEmpty());

        // Removendo todos os elementos
        fila.poll();
        fila.poll();
        System.out.println("Fila após remover todos os elementos: " + fila);

        // Teste do método estaVazia após remover todos os elementos
        System.out.println("A fila está vazia? " + fila.isEmpty());

        // Teste do método tamanho (size no LinkedList)
        fila.add(10);
        fila.add(20);
        System.out.println("Tamanho da fila: " + fila.size());

        // Teste do método aumentaCapacidade (LinkedList não tem capacidade fixa, então o teste é implícito)
        for (int i = 0; i < 20; i++) {
            fila.add(i + 1);
        }
        System.out.println("Fila após enfileirar 20 elementos: " + fila);
        System.out.println("Tamanho da fila após enfileirar 20 elementos: " + fila.size());

        // Teste do método toString
        System.out.println("Fila final: " + fila);
    }

}
