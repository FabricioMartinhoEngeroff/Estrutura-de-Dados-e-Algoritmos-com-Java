package org.estruturaDeDados.vetorTest;

import org.estruturaDeDados.contatoVetor.Vetor;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Cria um ArrayList com capacidade inicial para 6 elementos
        ArrayList<String> arrayList = new ArrayList<>(6);

        // Adiciona elementos ao ArrayList
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add("G");

        // Exibe o conteúdo do ArrayList
        System.out.println("ArrayList inicial: " + arrayList);

        // Adiciona um elemento em uma posição específica
        arrayList.add(0, "A");
        System.out.println("Após adicionar 'A' na posição 0: " + arrayList);

        // Remove um elemento por índice
        arrayList.remove(1);
        System.out.println("Após remover o elemento na posição 1: " + arrayList);

        // Substitui um elemento em uma posição específica
        arrayList.set(2, "E");
        System.out.println("Após substituir 'D' por 'E': " + arrayList);

        // Verifica se o ArrayList contém um elemento
        boolean containsF = arrayList.contains("F");
        System.out.println("Contém 'F'? " + containsF);

        // Obtém um elemento por índice
        String elementAtIndex2 = arrayList.get(2);
        System.out.println("Elemento na posição 2: " + elementAtIndex2);

        // Obtém o índice de um elemento
        int indexOfG = arrayList.indexOf("G");
        System.out.println("Índice de 'G': " + indexOfG);

        // Verifica se o ArrayList está vazio
        boolean isEmpty = arrayList.isEmpty();
        System.out.println("ArrayList está vazio? " + isEmpty);

        // Ordena o ArrayList em ordem alfabética
        Collections.sort(arrayList);
        System.out.println("ArrayList ordenado: " + arrayList);

        // Cria uma sublista a partir do ArrayList
        ArrayList<String> subList = new ArrayList<>(arrayList.subList(1, 3));
        System.out.println("Sublista (elementos da posição 1 a 3): " + subList);

        // Adiciona todos os elementos de uma coleção ao ArrayList
        ArrayList<String> additionalList = new ArrayList<>();
        additionalList.add("H");
        additionalList.add("I");
        arrayList.addAll(additionalList);
        System.out.println("Após adicionar todos os elementos de outra lista: " + arrayList);

        // Remove todos os elementos de uma coleção do ArrayList
        arrayList.removeAll(additionalList);
        System.out.println("Após remover todos os elementos da outra lista: " + arrayList);

        // Retém apenas os elementos que estão na coleção especificada
        ArrayList<String> retainList = new ArrayList<>();
        retainList.add("A");
        retainList.add("B");
        arrayList.retainAll(retainList);
        System.out.println("Após reter apenas os elementos 'A' e 'B': " + arrayList);

        // Obtém o tamanho do ArrayList
        int size = arrayList.size();
        System.out.println("Tamanho do ArrayList: " + size);

        // Limpa o ArrayList
        arrayList.clear();
        System.out.println("ArrayList após clear: " + arrayList);

        // Verifica novamente se o ArrayList está vazio após a limpeza
        isEmpty = arrayList.isEmpty();
        System.out.println("ArrayList está vazio após clear? " + isEmpty);
    }
}