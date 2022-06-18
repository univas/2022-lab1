package br.edu.univas;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};

        float[] mediaTemperaturas = new float[12];
        float somaTotalMediaTemperatura = 0.0f;

        for (int i = 0; i < 12; i++) {
            System.out.println("Por favor, digite a temperatura média do mês " + meses[i]);
            mediaTemperaturas[i] = leitura.nextFloat();
            somaTotalMediaTemperatura += mediaTemperaturas[i];
        }

        float mediaTemperaturaAnual = somaTotalMediaTemperatura / 12;
        System.out.println("Meses com temperatura acima da média (" + mediaTemperaturaAnual + "):");

        for (int i = 0; i < 12; i++) {
            if (mediaTemperaturas[i] > mediaTemperaturaAnual) {
                System.out.println(meses[i] + " - " + mediaTemperaturas[i]);
            }
        }

        leitura.close();
    }
}
