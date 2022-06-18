package br.edu.univas;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Por favor digite um número:");
            int number = leitura.nextInt();
            if (number % 3 == 0) {
                sum += number;
            }
        }

        System.out.println("A soma dos números divisíveis por 3 é: " + sum);

        leitura.close();
    }
}
