package br.edu.univas;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Por favor, digite a nota");
            int nota = leitura.nextInt();
            soma += nota;
        }

        int media = soma / 30;
        System.out.println("A media da prova foi: " + media);

        leitura.close();
    }
}
