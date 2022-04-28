package br.edu.univas;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite sua idade:");
        int idade = leitura.nextInt();

        String nome = "Rodrigo";

        if (idade < 16) {
            System.out.println("Você não pode votar!");
        } else if (idade == 16 || idade == 17) {
            System.out.println("Você pode votar mas não é obrigatório!");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Você precisar votar!");
        } else {
            System.out.println("Você pode votar mas não é obrigatório!");
        }

        switch(idade) {
            case 7:
                System.out.println("Você estuda na 3ª série");
                break;
            default:
                System.out.println("Você não digitou uma idade válida");
        }

        System.out.println("Obrigado por participar!!!");
    }
}
