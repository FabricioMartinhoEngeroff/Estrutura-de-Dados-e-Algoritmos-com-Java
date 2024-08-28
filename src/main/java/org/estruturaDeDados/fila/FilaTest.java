package org.estruturaDeDados.fila;

public class FilaTest {


    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>();


        // Teste do método enfileirar
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        System.out.println("Fila após enfileirar elementos: " + fila);

        // Teste do método espiar
        Integer elementoEspiado = fila.espiar();
        System.out.println("Elemento espiado: " + elementoEspiado);

        // Teste do método desinfileirar
        Integer elementoRemovido = fila.desinfileirar();
        System.out.println("Elemento removido: " + elementoRemovido);
        System.out.println("Fila após desinfileirar: " + fila);

        // Teste do método estaVazia
        System.out.println("A fila está vazia? " + fila.estaVazia());

        // Removendo todos os elementos
        fila.desinfileirar();
        fila.desinfileirar();
        System.out.println("Fila após remover todos os elementos: " + fila);

        // Teste do método estaVazia após remover todos os elementos
        System.out.println("A fila está vazia? " + fila.estaVazia());

        // Teste do método tamanho
        fila.enfileirar(10);
        fila.enfileirar(20);
        System.out.println("Tamanho da fila: " + fila.tamanho());

        // Teste do método aumentaCapacidade (não é testado diretamente, mas será acionado ao enfileirar muitos elementos)
        for (int i = 0; i < 20; i++) {
            fila.enfileirar(i + 1);
        }
        System.out.println("Fila após enfileirar 20 elementos: " + fila);
        System.out.println("Tamanho da fila após enfileirar 20 elementos: " + fila.tamanho());

        // Teste do método toString
        System.out.println("Fila final: " + fila);
    }
}


