package org.estruturaDeDados.vetorGavetas;

public class Gaveteiro {

    // Array que representa as gavetas do gaveteiro
    private String[] gavetas;

    // Quantidade atual de brinquedos no gaveteiro
    private int quantidadeDeBrinquedos;

    // Construtor que cria um gaveteiro com um número específico de gavetas
    public Gaveteiro(int capacidade) {
        // Inicializa as gavetas com o tamanho especificado
        this.gavetas = new String[capacidade];

        // Inicializa a quantidade de brinquedos como zero
        this.quantidadeDeBrinquedos = 0;
    }

    // Método para adicionar um brinquedo em uma gaveta
    public void adicionarBrinquedo(String brinquedo, int posicao) {
        // Verifica se a posição é válida
        if (!(posicao >= 0 && posicao <= quantidadeDeBrinquedos)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        // Verifica se há espaço suficiente para adicionar um novo brinquedo
        if (quantidadeDeBrinquedos >= gavetas.length) {
            throw new IllegalStateException("Não há espaço suficiente para adicionar o brinquedo!");
        }

        // Move os brinquedos existentes para abrir espaço na gaveta
        for (int i = quantidadeDeBrinquedos - 1; i >= posicao; i--) {
            this.gavetas[i + 1] = this.gavetas[i];
        }

        // Adiciona o novo brinquedo na posição desejada
        this.gavetas[posicao] = brinquedo;
        this.quantidadeDeBrinquedos++;
    }

    // Método para buscar a posição de um brinquedo no gaveteiro
    public int buscarBrinquedo(String brinquedo) {
        // Percorre todas as gavetas ocupadas
        for (int i = 0; i < quantidadeDeBrinquedos; i++) {
            // Verifica se o brinquedo na gaveta atual é o que estamos buscando
            if (this.gavetas[i].equals(brinquedo)) {
                return i; // Retorna a posição do brinquedo
            }
        }
        return -1; // Retorna -1 se o brinquedo não for encontrado
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

