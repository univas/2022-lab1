package br.edu.univas;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor digite o sexo:");
        int sexo = leitura.nextInt();

        System.out.println("Por favor digite sua altura:");
        float altura = leitura.nextFloat();

        float pesoIdeal;
        if (sexo == 0) {
            pesoIdeal = 62.1f * altura - 44.7f;
        } else {
            pesoIdeal = 72.7f * altura - 58;
        }

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}
