package org.estruturaDeDados.pilha;

import org.estruturaDeDados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) {
        super.adiciona(elemento);

    }

    public T topo(){
        if(estaVazia()){
            return null;
        }
        return elementos[tamanho-1];
    }
}
