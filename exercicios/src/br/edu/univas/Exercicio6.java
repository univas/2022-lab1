package br.edu.univas;

public class Exercicio6 {

    public static void main(String[] args) {
        float precoGasolina = 7.40f;
        float precoEtanol = 5.30f;

        float resultado = precoEtanol / precoGasolina * 100;
        if (resultado > 70f) {
            System.out.println("Gasolina");
        } else {
            System.out.println("Etanol");
        }
    }
}
