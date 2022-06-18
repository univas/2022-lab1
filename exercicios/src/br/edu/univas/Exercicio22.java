package br.edu.univas;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroVitoriaArgentina = 0;
        int numeroVitoriaBrasil = 0;
        int numeroEmpate = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite os gols da Argentina:");
            int golsArgentina = leitura.nextInt();

            System.out.println("Digite os gols do Brasil:");
            int golsBrasil = leitura.nextInt();

            if (golsArgentina > golsBrasil) {
                numeroVitoriaArgentina++;
            } else if (golsArgentina < golsBrasil) {
                numeroVitoriaBrasil++;
            } else {
                numeroEmpate++;
            }
        }

        System.out.println("Quantidade vitória Argentina: " + numeroVitoriaArgentina);
        System.out.println("Quantidade vitória Brasil: " + numeroVitoriaBrasil);
        System.out.println("Empates: " + numeroEmpate);

        leitura.close();
    }
}
