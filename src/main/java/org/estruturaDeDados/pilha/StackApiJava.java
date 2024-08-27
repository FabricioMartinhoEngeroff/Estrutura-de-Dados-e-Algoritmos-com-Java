package org.estruturaDeDados.pilha;

import java.util.Stack;

public class StackApiJava {

    public static void main(String[] args) {


        Stack<Integer> pilha = new Stack<Integer>();

        System.out.println(pilha.isEmpty());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
        System.out.println(pilha);

        System.out.println(pilha.peek());

        System.out.println(pilha.pop());

        System.out.println(pilha);
    }

}