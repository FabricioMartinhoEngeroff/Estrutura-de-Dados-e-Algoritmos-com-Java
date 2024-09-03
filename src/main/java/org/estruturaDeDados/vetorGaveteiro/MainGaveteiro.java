package org.estruturaDeDados.vetorGaveteiro;

public class MainGaveteiro {

        public static void main(String[] args) {

            VetorGaveteiro gaveteiro = new VetorGaveteiro(5);


            gaveteiro.adicionarBrinquedo("Carro", 0);
            gaveteiro.adicionarBrinquedo("Boneca", 1);
            gaveteiro.adicionarBrinquedo("Bola", 2);
            gaveteiro.adicionarBrinquedo("Quebra-cabeça", 3);
            gaveteiro.adicionarBrinquedo("Urso de pelúcia", 4);

            System.out.println(gaveteiro);

            gaveteiro.excluirBrinquedo(2);

            System.out.println(gaveteiro);

            int posicaoBoneca = gaveteiro.buscarBrinquedo("Boneca");
            System.out.println("Posição da Boneca: " + posicaoBoneca);

            try {
                gaveteiro.adicionarBrinquedo("Carrinho", 6);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            try {
                gaveteiro.excluirBrinquedo(5);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }