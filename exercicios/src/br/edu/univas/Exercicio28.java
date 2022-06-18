package br.edu.univas;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] numerosSorteados = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Por favor, digite o número sorteado:");
            int numeroSorteado = leitura.nextInt();

            while (numeroSorteado < 1 || numeroSorteado > 60) {
                System.out.println("O número digitado não está correto.");
                System.out.println("Por favor, difite um número válido: "
                        + "entre 1 (inclusive) e 60 (inclusive)");
                numeroSorteado = leitura.nextInt();
            }

            numerosSorteados[i] = numeroSorteado;
        }

        int[] numerosApostados = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Por favor, digite o número apostado:");
            int numeroSorteado = leitura.nextInt();

            while (numeroSorteado < 1 || numeroSorteado > 60) {
                System.out.println("O número digitado não está correto.");
                System.out.println("Por favor, difite um número válido: "
                        + "entre 1 (inclusive) e 60 (inclusive)");
                numeroSorteado = leitura.nextInt();
            }

            numerosApostados[i] = numeroSorteado;
        }

        int quantidadeNumerosAcertados = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numerosSorteados[i] == numerosApostados[j]) {
                    quantidadeNumerosAcertados++;
                    break;
                }
            }
        }

        if (quantidadeNumerosAcertados == 6) {
            System.out.println("Parabéns!!! Você já pode se aposentar!");
        } else if (quantidadeNumerosAcertados == 5) {
            System.out.println("Você acertou 5 números! Vá até uma agência para retirar seu prêmio!");
        } else if (quantidadeNumerosAcertados == 4) {
            System.out.println("Você acertou 4 números! Vá até uma lotérica para retirar seu prêmio!");
        } else if (quantidadeNumerosAcertados <= 3 && quantidadeNumerosAcertados >= 1) {
            System.out.println("Você acertou apenas " + quantidadeNumerosAcertados + " número(s)! Tente outra vez!");
        } else {
            System.out.println("Não foi dessa vez :( Tente outra vez!");
        }

        leitura.close();
    }
}
