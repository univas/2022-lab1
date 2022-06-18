package br.edu.univas;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int counterEvenNumbers = 0;
        int sumEvenNumbers = 0;

        while (true) {
            System.out.println("Digite um número:");
            int number = leitura.nextInt();

            if (number % 2 == 0) {
                sumEvenNumbers += number;
                counterEvenNumbers++;

                if (counterEvenNumbers == 10) {
                    break;
                }
            }
        }

        System.out.println("A soma dos 10 números pares digitados foi: " + sumEvenNumbers);

        leitura.close();
    }
}
