package br.edu.univas;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contadorNumerosPares = 0;
        int contadorNumerosImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número:");
            int numero = leitura.nextInt();

            if (numero % 2 == 0) {
                contadorNumerosPares++;
            } else {
                contadorNumerosImpares++;
            }
        }

        System.out.println("Número total de pares: " + contadorNumerosPares);
        System.out.println("Número total de ímpares: " + contadorNumerosImpares);

        leitura.close();
    }
}
