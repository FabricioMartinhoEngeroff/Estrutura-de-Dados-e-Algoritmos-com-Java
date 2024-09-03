package org.estruturaDeDados.fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class FilaComPrioridade<T> extends Fila<T> {

    public static void main(String[] args) {

        Queue<Integer> fila = new PriorityQueue<>();

        fila.add(1);
        fila.add(3);
        fila.add(2);

        System.out.println("Fila após enfileirar elementos (na ordem de remoção):");

        while (!fila.isEmpty()) {
            System.out.print(fila.poll() + " ");
        }
    }
}
