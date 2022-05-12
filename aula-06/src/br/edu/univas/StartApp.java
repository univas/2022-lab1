package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!!!");
            System.out.println("Valor atual de I: " + i);
        }

        for (int i = 0, j = 5; i < 10; i++) {
            System.out.println("I = " + i + " J = " + j);
        }

        int idade = 20;
        int anoAtual = 2022;
        for (; idade >= 0; idade--) {
            System.out.println("Idade = " + idade + " ano = " + anoAtual--);
        }

        for (; idade <= 20; ) {
            System.out.println("Idade = " + idade++ + " ano = " + anoAtual++);
        }

        for (;;) {
            System.out.println("Idade = " + idade-- + " ano = " + anoAtual--);
            if (idade == -1) {
                break;
            }
        }

        while (idade <= 20) {
            System.out.println("Idade = " + idade++ + " ano = " + anoAtual++);
        }

        while (true) {
            System.out.println("Idade = " + idade-- + " ano = " + anoAtual--);
            if (idade < 0) {
                break;
            }
        }

        do {
            System.out.println("Idade = " + idade++ + " ano = " + anoAtual++);
        } while (idade <= 20);
    }
}
