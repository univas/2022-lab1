package br.edu.univas;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor digite o primeiro valor:");
        int a = leitura.nextInt();
        System.out.println("Por favor digite o segundo valor:");
        int b = leitura.nextInt();
        System.out.println("Por favor digite o terceiro valor:");
        int c = leitura.nextInt();
        System.out.println("Por favor digite o quarto valor:");
        int d = leitura.nextInt();

        int result = (a * b) - (c * d);
        System.out.println("Resultado = " + result);
    }
}
