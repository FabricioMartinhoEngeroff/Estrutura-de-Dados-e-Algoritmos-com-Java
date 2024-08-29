package org.estruturaDeDados.listaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if (tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void limpa() {

        for (No<T> atual = this.inicio; atual != null; ) {
            No<T> proximo = atual.getProximo();
            // Limpa as referências do nó atual
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        // Reseta os ponteiros da lista
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");

        if (this.tamanho == 0) {
            return "[]";
        }
        No<T> atual = this.incio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }
}

