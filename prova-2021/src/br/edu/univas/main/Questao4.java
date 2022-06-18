package br.edu.univas.main;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        float[] vendas = new float[150];
        float menorVenda = 0.0f;
        float maiorVenda = 0.0f;
        float somaVendas = 0.0f;

        for (int i = 0; i < 150; i++) {
            System.out.println("Por favor digite o valor da venda:");
            vendas[i] = leitura.nextFloat();
            somaVendas += vendas[i];

            if (i == 0) {
                menorVenda = vendas[i];
                maiorVenda = vendas[i];
            } else if (vendas[i] < menorVenda) {
                menorVenda = vendas[i];
            } else if (vendas[i] > maiorVenda) {
                maiorVenda = vendas[i];
            }
        }

        float precoMedio = somaVendas / 150;
        System.out.println("Menor venda: " + menorVenda);
        System.out.println("Maior venda: " + maiorVenda);
        System.out.println("Soma das vendas: " + somaVendas);
        System.out.println("Média das vendas: " + precoMedio);
    }
}
