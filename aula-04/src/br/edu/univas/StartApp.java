package br.edu.univas;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor digite o nome:");
        String nome = leitura.nextLine();
        System.out.println("Nome digitado: " + nome);

        System.out.println("Por favor digite a idade:");
        int idade = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Idade digitada: " + idade);

        System.out.println("Por favor digite o sobrenome:");
        String sobrenome = leitura.nextLine();
        System.out.println("Sobrenome digitado: " + sobrenome);

        System.out.println("Por favor digite o peso:");
        double peso = leitura.nextDouble();
        System.out.println("Peso digitado: " + peso);

        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }
}
