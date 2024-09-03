package org.estruturaDeDados.linkedListGaveteiro;

import java.util.LinkedList;

public class  Gaveteiro {

    private LinkedList<String> brinquedos;

    public Gaveteiro() {
        this.brinquedos = new LinkedList<>();
    }

    public void adicionarBrinquedo(String brinquedo) {
        brinquedos.add(brinquedo);
    }

    public void adicionarBrinquedo(int posicao, String brinquedo) {
        if (posicao >= 0 && posicao <= brinquedos.size()) {
            brinquedos.add(posicao, brinquedo);
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public boolean removerBrinquedo(String brinquedo) {
        return brinquedos.remove(brinquedo);
    }

    public String removerBrinquedo(int posicao) {
        if (posicao >= 0 && posicao < brinquedos.size()) {
            return brinquedos.remove(posicao);
        } else {
            System.out.println("Posição inválida.");
            return null;
        }
    }

    public String obterBrinquedo(int posicao) {
        if (posicao >= 0 && posicao < brinquedos.size()) {
            return brinquedos.get(posicao);
        } else {
            System.out.println("Posição inválida.");
            return null;
        }
    }

    public boolean contemBrinquedo(String brinquedo) {
        return brinquedos.contains(brinquedo);
    }

    public void listarBrinquedos() {
        if (brinquedos.isEmpty()) {
            System.out.println("A gaveta está vazia.");
        } else {
            for (String brinquedo : brinquedos) {
                System.out.println(brinquedo);
            }
        }
    }

    public int quantidadeDeBrinquedos() {
        return brinquedos.size();
    }

    public void limparGaveta() {
        brinquedos.clear();
    }
}