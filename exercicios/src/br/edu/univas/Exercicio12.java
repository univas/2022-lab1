package br.edu.univas;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do aluno:");
        String nome = leitura.nextLine();
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Por favor digite a nota:");
            int notaAtual = leitura.nextInt();
            soma += notaAtual;
        }

        int media = soma / 4;
        if (media > 59) {
            System.out.println("Aprovado");
        } else if (media > 39) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
