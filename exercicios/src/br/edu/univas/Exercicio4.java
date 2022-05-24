package br.edu.univas;

public class Exercicio4 {

    public static void main(String[] args) {
        int a = 14;
        int b = 7;
        int c = a % b;

        if (c == 0) {
            System.out.println("Divisão de " + a + " por " + b + " é perfeita!");
            //System.out.println(String.format("Divisão de %d por %d é perfeita!", a, b));
        } else {
            System.out.println("Divisão de " + a + " por " + b + " sobra " + c);
        }
    }
}
