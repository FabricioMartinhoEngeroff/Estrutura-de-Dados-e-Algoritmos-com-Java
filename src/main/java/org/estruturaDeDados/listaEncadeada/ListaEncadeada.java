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

    private No<T> buscaNo(int posicao) {
        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException("Posição não encontrada");
        }
        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int buscar(T elemento) {
        No<T> noAtual = this.inicio;
        int posicao = 0;

        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return posicao;
            }
            posicao++;
            noAtual = noAtual.getProximo();
        }
        return naoEncotrado;
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
        tamanho++;
    }


    public void adicionaQualquerPosicao(int posicao, T elemento) {

        if (this.posicaoNaoExiste(posicao)) {
            throw new IllegalArgumentException("posição inválida");
        }
        if (posicao == 0) {
            this.adicionaInicio(elemento);
        } else if (posicao == this.tamanho) {
            this.adiciona(elemento);
        } else {
            No<T> noAnterior = this.buscaNo(posicao - 1);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            tamanho++;
        }

    }

  public T removeInicio(){
        if(this.tamanho == 0){
            throw new RuntimeException("Lista vazia");
        }
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho -- ;

        if(this.tamanho == 0){
            this.ultimo = null;
        }

        return removido;
  }

    private boolean posicaoNaoExiste(int posicao) {
        return posicao < 0 || posicao >= this.tamanho;
    }

  public T removePosicao (int posicao){
      if (this.posicaoNaoExiste(posicao)) {
          throw new IllegalArgumentException("posição não existe!");
      }
      if (posicao == 0){
          return this.removeInicio();
      }
      if (posicao == this.tamanho -1){
          return  this.removeFinal();
      }

      No<T> noAnterior = this.buscaNo(posicao -1);
      No<T> atual = noAnterior.getProximo();
      No<T> proximo = atual.getProximo();
      noAnterior.setProximo(proximo);
      atual.setProximo(null);
      tamanho --;
      return atual.getElemento();
  }


  public T removeFinal() {
      if (this.tamanho == 0) {
          throw new RuntimeException("Lista vazia");
      }
      if (this.tamanho == 1) {
          return this.removeInicio();
      }
      No<T> penultimoNo = this.buscaNo(this.tamanho - 2);
      T removido = penultimoNo.getProximo().getElemento();
      penultimoNo.setProximo(null);
      this.ultimo = penultimoNo;
      tamanho--;

      return removido;


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

