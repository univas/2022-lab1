package br.edu.univas.main;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int[] numeros = new int[25];
        int contadorNumerosNegativos = 0;

        for (int i = 0; i < 25; i++) {
            System.out.println("Digite um número:");
            int numero = leitura.nextInt();
            if (numero >= 0) {
                numeros[i] = numero;
            } else {
                contadorNumerosNegativos++;
                numeros[i] = 100;
            }
        }

        int porcentagem = contadorNumerosNegativos * 100 / 25;
        System.out.println("Quantidade números negativos: " + contadorNumerosNegativos);
        System.out.println("Porcentagem números negativos: " + porcentagem);
    }
}
