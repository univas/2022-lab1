package br.edu.univas;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double totalSales = 0.0d;

        do {
            double sale = leitura.nextDouble();
            if (sale == -1) {
                break;
            }

            totalSales += sale;

        } while (true);

        System.out.println("O total de vendas do dia foi: " + totalSales);

        leitura.close();
    }
}
