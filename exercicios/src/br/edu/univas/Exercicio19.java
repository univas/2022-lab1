package br.edu.univas;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int contadorMaria = 0;
        int contadorJoao = 0;
        int contadorJose = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Por favor digite seu voto:");
            int voto = leitura.nextInt();

            if (voto == 1) {
                contadorMaria++;
            } else if (voto == 2) {
                contadorJoao++;
            } else {
                contadorJose++;
            }
        }

        if (contadorMaria > contadorJoao && contadorMaria > contadorJose) {
            System.out.println("A Maria foi a campeã");
        } else if (contadorJoao > contadorJose) {
            System.out.println("O João foi o campeão");
        } else {
            System.out.println("O José foi o campeão");
        }

        leitura.close();
    }
}
