package br.edu.univas;

import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] values = new int[50];

        for (int i = 0; i < 50; i++) {
            System.out.println("Por favor, digite um número:");
            values[i] = leitura.nextInt();
        }

        int counterNegativeNumbers = 0;
        for (int i = 0; i < 50; i++) {
            if (values[i] < 0) {
                values[i] = 0;
                counterNegativeNumbers++;
            }
        }

        System.out.println("Foram substituidos " + counterNegativeNumbers + " números negativos por zero.");

        leitura.close();
    }
}
