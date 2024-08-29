package org.estruturaDeDados.listaEncadeada;

public class ListaEncadeada<T>{

    private No<T> incio;
    private int tamanho;

    public void adiciona(T elemento){
        No<T> celula = new No<>(elemento);
        this.incio = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "incio=" + incio +
                '}';
    }
}
