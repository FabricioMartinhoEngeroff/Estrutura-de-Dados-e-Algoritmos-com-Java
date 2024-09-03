package org.estruturaDeDados.contatoVetor;

public class MainObjetos {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("conato 1", "34547555", "conato1@com");
        Contato c2 = new Contato("conato 1", "34547555", "conato1@com");
        Contato c3 = new Contato("conato 1", "34547555", "conato1@com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("tamanho = " + vetor.tamanho());

        System.out.println(vetor);


    }
}