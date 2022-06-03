package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int somaTotal = 0;
        int maximo = 27;
        int[] notas = new int[maximo];

        for (int i = 0; i < maximo; i++) {
            System.out.println("Por favor digite a nota:");
            notas[i] = leitura.nextInt();
            somaTotal += notas[i];
        }

        int media = somaTotal / maximo;
        System.out.println("A media das notas foi: " + media);
        System.out.println("A nota de cada aluno foi:");

        for (int i = 0; i < maximo; i++) {
            System.out.println(notas[i]);
        }
    }
}
