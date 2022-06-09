package br.edu.univas.main;

public class Questao2 {

    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            String temp = "";
            for (int j = 0; j < i; j++) {
                temp += "*";
            }

            System.out.println(temp);
        }
    }
}
