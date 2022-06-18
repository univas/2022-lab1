package br.edu.univas;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] items1 = new int[10];
        int[] items2 = new int[10];
        int[] items3 = new int[10];

        System.out.println(":::Items do primeiro array:::");
        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor digite um número:");
            items1[i] = leitura.nextInt();
        }

        System.out.println(":::Items do segundo array:::");
        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor digite um número:");
            items2[i] = leitura.nextInt();
        }

        System.out.println(":::Items do terceiro array:::");
        for (int i = 0; i < 10; i++) {
            items3[i] = items1[i] * items2[i];
            System.out.println(items3[i]);
        }

        leitura.close();
    }
}
