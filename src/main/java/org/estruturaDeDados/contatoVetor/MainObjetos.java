package org.estruturaDeDados.contatoVetor;

public class MainObjetos {

    public static void main(String[] args) {
        // Cria um vetor com capacidade para 3 elementos
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("conato 1", "34547555", "conato1@com");
        Contato c2 = new Contato("conato 1", "34547555", "conato1@com");
        Contato c3 = new Contato("conato 1", "34547555", "conato1@com");

        // Adiciona elementos ao vetor nas posições apropriadas
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        // Exibe o conteúdo do vetor
        System.out.println("tamanho = " + vetor.tamanho());

        System.out.println(vetor);


    }
}