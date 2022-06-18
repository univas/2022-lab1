package br.edu.univas;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] notas = new int[30];
        int menor = 0;
        int maior = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Por favor, digite sua nota:");
            int nota = leitura.nextInt();
            notas[i] = nota;

            if (i == 0) {
                menor = nota;
                maior = nota;
            } else if (nota < menor) {
                menor = nota;
            } else if (nota > maior) {
                maior = nota;
            }
        }

        int soma = 0;
        int contador = 0;

        for (int i = 0; i < 30; i++) {
            if (notas[i] != menor && notas[i] != maior) {
                soma += notas[i];
                contador++;
            }
        }

        int media = soma / contador;
        System.out.println("A média da prova foi de: " + media);

        leitura.close();
    }
}
