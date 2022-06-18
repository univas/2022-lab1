package br.edu.univas.main;

public class Questao6 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
