package org.estruturaDeDados.listaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private int naoEncotrado = -1;

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

    private No<T> buscaNo(int posicao){
        if(posicao < 0 || posicao >= this.tamanho){
            throw new IllegalArgumentException("Posição não encontrada");
        }
        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++){
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    public T buscaPorPosicao(int posicao){
        return this.buscaNo(posicao).getElemento();
    }

    public int buscar (T elemento){
        No<T> noAtual = this.inicio;
        int posicao = 0;

        while (noAtual != null){
            if(noAtual.getElemento().equals(elemento)){
                return posicao;
            }
            posicao++;
            noAtual = noAtual.getProximo();
        }
        return naoEncotrado;
    }

    public void adicionaInicio(T elemento){
        if(this.tamanho == 0){
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        }
        else { No<T>novoNo = new No<>(elemento);
            novoNo.setProximo(this.inicio);

        }
        tamanho ++;
    }

    public void adicionaQualquerPosicao(int posicao,T elemento){

        if(posicao < 0 || posicao > this.tamanho){
            throw new IllegalArgumentException("posição inválida");
        }
        if(posicao == 0){
            this.adicionaInicio(elemento);
        }
        else if (posicao == this.tamanho){
            this.adiciona(elemento);
        }
        else {
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            tamanho++;
        }

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

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");

        if (this.tamanho == 0) {
            return "[]";
        }
        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }


}

