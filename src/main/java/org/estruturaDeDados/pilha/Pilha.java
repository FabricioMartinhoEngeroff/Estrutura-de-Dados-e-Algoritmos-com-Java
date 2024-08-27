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
}
