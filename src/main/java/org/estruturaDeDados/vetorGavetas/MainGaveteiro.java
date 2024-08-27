package org.estruturaDeDados.vetorGavetas;

public class MainGaveteiro {

        public static void main(String[] args) {
            // Cria um gaveteiro com capacidade para 5 brinquedos
            Gaveteiro gaveteiro = new Gaveteiro(5);

            // Adiciona brinquedos ao gaveteiro
            gaveteiro.adicionarBrinquedo("Carro", 0);
            gaveteiro.adicionarBrinquedo("Boneca", 1);
            gaveteiro.adicionarBrinquedo("Bola", 2);
            gaveteiro.adicionarBrinquedo("Quebra-cabeça", 3);
            gaveteiro.adicionarBrinquedo("Urso de pelúcia", 4);

            // Exibe o estado atual do gaveteiro
            System.out.println(gaveteiro);

            // Exclui o brinquedo da posição 2 (Bola)
            gaveteiro.excluirBrinquedo(2);

            // Exibe o estado do gaveteiro após a remoção
            System.out.println(gaveteiro);

            // Busca a posição do brinquedo "Boneca"
            int posicaoBoneca = gaveteiro.buscarBrinquedo("Boneca");
            System.out.println("Posição da Boneca: " + posicaoBoneca);

            // Tenta adicionar um brinquedo em uma posição inválida
            try {
                gaveteiro.adicionarBrinquedo("Carrinho", 6);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Tenta excluir um brinquedo de uma posição inválida
            try {
                gaveteiro.excluirBrinquedo(5);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }