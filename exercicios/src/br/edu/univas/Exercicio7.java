package br.edu.univas;

public class Exercicio7 {

    public static void main(String[] args) {
        int a = 30;
        int b = 5;
        int c = 9;
        int d = 15;
        int e = 18;
        int soma = 0;

        if (a % 2 == 0) soma += a;
        if (b % 2 == 0) soma += b;
        if (c % 2 == 0) soma += c;
        if (d % 2 == 0) soma += d;
        if (e % 2 == 0) soma += e;

        System.out.println("O valor da soma dos numeros pares é: " + soma);
    }
}
