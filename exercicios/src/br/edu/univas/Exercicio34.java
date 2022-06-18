package br.edu.univas;

import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] notasTurmaA = new int[30];
        int[] notasTurmaB = new int[30];

        int totalTurmaA = 0;
        int totalTurmaB = 0;

        System.out.println("Notas Turma A");

        for (int i = 0; i < 30; i++) {
            System.out.println("Por favor, digite uma nota:");

            int nota = leitura.nextInt();
            notasTurmaA[i] = nota;
            totalTurmaA += nota;
        }

        System.out.println("Notas Turma B");

        for (int i = 0; i < 30; i++) {
            System.out.println("Por favor, digite uma nota:");

            int nota = leitura.nextInt();
            notasTurmaB[i] = nota;
            totalTurmaB += nota;
        }

        int mediaTurmaA = totalTurmaA / 30;
        int mediaTurmaB = totalTurmaB / 30;

        System.out.println("Média da Turma A: " + mediaTurmaA);
        System.out.println("Média da Turma B: " + mediaTurmaB);

        leitura.close();
    }
}
