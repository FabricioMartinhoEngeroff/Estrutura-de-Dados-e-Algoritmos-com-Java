package org.estruturaDeDados.linkedListGaveteiro;

import java.util.LinkedList;

public class  Gaveteiro {

    private LinkedList<String> brinquedos;

    public Gaveteiro() {
        this.brinquedos = new LinkedList<>();
    }

    // Adiciona um brinquedo no final da lista
    public void adicionarBrinquedo(String brinquedo) {
        brinquedos.add(brinquedo);
    }

    // Adiciona um brinquedo em uma posição específica
    public void adicionarBrinquedo(int posicao, String brinquedo) {
        if (posicao >= 0 && posicao <= brinquedos.size()) {
            brinquedos.add(posicao, brinquedo);
        } else {
            System.out.println("Posição inválida.");
        }
    }

    // Remove o brinquedo pelo nome
    public boolean removerBrinquedo(String brinquedo) {
        return brinquedos.remove(brinquedo);
    }

    // Remove o brinquedo em uma posição específica
    public String removerBrinquedo(int posicao) {
        if (posicao >= 0 && posicao < brinquedos.size()) {
            return brinquedos.remove(posicao);
        } else {
            System.out.println("Posição inválida.");
            return null;
        }
    }

    // Obtém um brinquedo em uma posição específica
    public String obterBrinquedo(int posicao) {
        if (posicao >= 0 && posicao < brinquedos.size()) {
            return brinquedos.get(posicao);
        } else {
            System.out.println("Posição inválida.");
            return null;
        }
    }

    // Verifica se a gaveta contém um brinquedo específico
    public boolean contemBrinquedo(String brinquedo) {
        return brinquedos.contains(brinquedo);
    }

    // Imprime todos os brinquedos na gaveta
    public void listarBrinquedos() {
        if (brinquedos.isEmpty()) {
            System.out.println("A gaveta está vazia.");
        } else {
            for (String brinquedo : brinquedos) {
                System.out.println(brinquedo);
            }
        }
    }

    // Retorna a quantidade de brinquedos na gaveta
    public int quantidadeDeBrinquedos() {
        return brinquedos.size();
    }

    // Limpa todos os brinquedos da gaveta
    public void limparGaveta() {
        brinquedos.clear();
    }
}