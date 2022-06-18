package br.edu.univas;

public class Exercicio20 {

    public static void main(String[] args) {
        int soma = 0;

        for (int i = 2; i <= 100; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos numeros pares é: " + soma);
    }
}
