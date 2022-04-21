package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        int idade = 10;

        if (idade >= 18) {
            System.out.println("Você é obrigado a votar!");
        } else {
            System.out.println("Você não é obrigado a votar!");
        }

        if (idade < 16) {
            System.out.println("Você não pode votar!");
        } else if (idade < 18) {
            System.out.println("Você não é obrigado a votar!");
        } else if (idade <= 65) {
            System.out.println("Você é obrigado a votar!");
        } else {
            System.out.println("Você não é obrigado a votar!");
        }

    }

}
