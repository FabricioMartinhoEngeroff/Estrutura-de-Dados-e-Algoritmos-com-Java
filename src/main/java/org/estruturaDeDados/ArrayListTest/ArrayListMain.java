package org.estruturaDeDados.ArrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(6);

        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("G");

        System.out.println("ArrayList inicial: " + arrayList);

        arrayList.add(0, "A");
        System.out.println("Após adicionar 'A' na posição 0: " + arrayList);

        arrayList.remove(1);
        System.out.println("Após remover o elemento na posição 1: " + arrayList);

        arrayList.set(2, "E");
        System.out.println("Após substituir 'D' por 'E': " + arrayList);

        boolean containsF = arrayList.contains("F");
        System.out.println("Contém 'F'? " + containsF);

        String elementAtIndex2 = arrayList.get(2);
        System.out.println("Elemento na posição 2: " + elementAtIndex2);

        int indexOfG = arrayList.indexOf("G");
        System.out.println("Índice de 'G': " + indexOfG);

        boolean isEmpty = arrayList.isEmpty();
        System.out.println("ArrayList está vazio? " + isEmpty);

        Collections.sort(arrayList);
        System.out.println("ArrayList ordenado: " + arrayList);

        ArrayList<String> subList = new ArrayList<>(arrayList.subList(1, 3));
        System.out.println("Sublista (elementos da posição 1 a 3): " + subList);

        ArrayList<String> additionalList = new ArrayList<>();
        additionalList.add("H");
        additionalList.add("I");
        arrayList.addAll(additionalList);
        System.out.println("Após adicionar todos os elementos de outra lista: " + arrayList);

        arrayList.removeAll(additionalList);
        System.out.println("Após remover todos os elementos da outra lista: " + arrayList);

        ArrayList<String> retainList = new ArrayList<>();
        retainList.add("A");
        retainList.add("B");
        arrayList.retainAll(retainList);
        System.out.println("Após reter apenas os elementos 'A' e 'B': " + arrayList);

        int size = arrayList.size();
        System.out.println("Tamanho do ArrayList: " + size);

        arrayList.clear();
        System.out.println("ArrayList após clear: " + arrayList);


        isEmpty = arrayList.isEmpty();
        System.out.println("ArrayList está vazio após clear? " + isEmpty);
    }
}