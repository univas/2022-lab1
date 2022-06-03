package br.edu.univas;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeMaisVelho = "";
        int anoNascimentoMaisVelho = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor digite seu nome:");
            String nome = leitura.nextLine();

            System.out.println("Por favor digite seu ano de nascimento:");
            int anoNascimento = leitura.nextInt();
            leitura.nextLine();

            if (i == 0 || anoNascimento < anoNascimentoMaisVelho) {
                nomeMaisVelho = nome;
                anoNascimentoMaisVelho = anoNascimento;
            }
        }

        System.out.println("O nome do mais velho é: " + nomeMaisVelho);
        int idade = 2022 - anoNascimentoMaisVelho;
        System.out.println("E sua idade é: " + idade);
    }
}
