package org.estruturaDeDados.fila;

import org.estruturaDeDados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        super.adiciona(elemento);
    }

    public T desinfileirar() {
        if (this.estaVazia()) {
            return null;
        }

        T elementoRemovido = this.elementos[0];

        for (int i = 0; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
        return elementoRemovido;
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }
}
