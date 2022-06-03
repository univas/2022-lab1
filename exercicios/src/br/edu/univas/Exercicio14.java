package br.edu.univas;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor digite o nome:");
        String nome = leitura.nextLine();

        System.out.println("Por favor digite a quantidade de " +
                "horas trabalhadas:");
        int horasTrabalhadas = leitura.nextInt();

        System.out.println("Por favor digite o valor/hora:");
        float valorPorHora = leitura.nextFloat();

        float total = horasTrabalhadas * valorPorHora;
        System.out.println("Sr(a) " + nome + " irá receber R$ " + total);
    }
}
