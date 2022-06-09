package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int[] idades = new int[1000];

        int idadeAtual = 0;
        int contador = 0;

        do {
            System.out.println("Por favor, digite sua idade:");
            idadeAtual = leitura.nextInt();
            if (idadeAtual != -1) {
                idades[contador++] = idadeAtual;
            }
        } while(idadeAtual != -1);

        int contador0A12Anos = 0;
        int contador13A17Anos = 0;
        int contador18A60Anos = 0;
        int contadorAcima60 = 0;

        for (int i = 0; i < contador; i++) {
            if (idades[i] <= 12) {
                contador0A12Anos++;
            } else if (idades[i] <= 17) {
                contador13A17Anos++;
            } else if (idades[i] <= 60) {
                contador18A60Anos++;
            } else {
                contadorAcima60++;
            }
        }

        int porcentagem0A12Anos = contador0A12Anos * 100 / contador;
        int porcentagem13A17Anos = contador13A17Anos * 100 / contador;
        int porcentagem18A60Anos = contador18A60Anos * 100 / contador;
        int porcentagemAcima60 = contadorAcima60 * 100 / contador;

        System.out.println("De 0 a 12 anos temos: " +
                contador0A12Anos + " pessoas que representam " +
                porcentagem0A12Anos + "% do total");
        System.out.println("De 13 a 17 anos temos: " +
                contador13A17Anos + " pessoas que representam " +
                porcentagem13A17Anos + "% do total");
        System.out.println("De 18 a 60 anos temos: " +
                contador18A60Anos + " pessoas que representam " +
                porcentagem18A60Anos + "% do total");
        System.out.println("Acima de 60 anos temos: " +
                contadorAcima60 + " pessoas que representam " +
                porcentagemAcima60 + "% do total");
    }
}
