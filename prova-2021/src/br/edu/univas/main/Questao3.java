package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int[] dados = new int[25];

        for (int i = 0; i < 25; i++) {
            System.out.println("Digite um numero:");
            dados[i] = leitura.nextInt();

            if (dados[i] < 0) {
                dados[i] = 0;
            }
        }

        for (int i = 0; i < 25; i++) {
            System.out.print(dados[i]);
            if (i < 24) {
                System.out.print(" - ");
            }
        }
    }
}
