package org.estruturaDeDados.vetorGaveteiro;

public class VetorGaveteiro {

    private String[] gavetas;

    private int quantidadeDeBrinquedos;


    public VetorGaveteiro(int capacidade) {
        this.gavetas = new String[capacidade];
        this.quantidadeDeBrinquedos = 0;
    }


    public void adicionarBrinquedo(String brinquedo, int posicao) {
        if (!(posicao >= 0 && posicao <= quantidadeDeBrinquedos)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        if (quantidadeDeBrinquedos >= gavetas.length) {
            throw new IllegalStateException("Não há espaço suficiente para adicionar o brinquedo!");
        }


        for (int i = quantidadeDeBrinquedos - 1; i >= posicao; i--) {
            this.gavetas[i + 1] = this.gavetas[i];
        }
        this.gavetas[posicao] = brinquedo;
        this.quantidadeDeBrinquedos++;
    }

    public int buscarBrinquedo(String brinquedo) {
        for (int i = 0; i < quantidadeDeBrinquedos; i++) {
            if (this.gavetas[i].equals(brinquedo)) {
                return i;
            }
        }
        return -1;
    }

    // 0 1 2 3 4 5 6 = quantidadeDeBrinquedos é 5
    // B C E F G + +
    // Desloca os brinquedos para a esquerda para preencher o espaço criado pela remoção
    public void excluirBrinquedo(int posicao){
        if (!(posicao >= 0 && posicao <= quantidadeDeBrinquedos)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i = posicao; i > this.quantidadeDeBrinquedos-1; i++) {
            this.gavetas[i] = gavetas[i - 1];
        }
        this.quantidadeDeBrinquedos --;

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Gaveteiro: [");

        for (int i = 0; i < quantidadeDeBrinquedos - 1; i++) {
            s.append(this.gavetas[i]);
            s.append(", ");
        }
        if (quantidadeDeBrinquedos > 0) {
            s.append(this.gavetas[quantidadeDeBrinquedos - 1]);
        }
        s.append("]");
        return s.toString();
    }
}

