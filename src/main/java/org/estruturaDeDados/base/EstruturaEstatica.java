package org.estruturaDeDados.base;

public class EstruturaEstatica <T>{

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(){
        this(10);
    }

    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade){
        this.elementos = (T[])new Object[capacidade];
        this.tamanho = 0;
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    protected boolean adiciona(int posicao, T elemento){

        if (!(posicao >= 0 && posicao <= tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    protected void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[])new Object[this.elementos.length * 2];
            for (int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

}
