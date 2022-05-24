package br.edu.univas;

public class Exercicio1 {

    public static void main(String[] args) {
        float salario = 1378.2f;

        if (salario <= 1903.98f) {
            System.out.println("Você está isento do IR!");
        } else if (salario <= 2826.66f) {
            System.out.println("Você se enquadrou na faixa de: 7,5% do IR");
        } else if (salario <= 3751.05f) {
            System.out.println("Você se enquadrou na faixa de: 15,0% do IR");
        } else if (salario <= 4664.68f) {
            System.out.println("Você se enquadrou na faixa de: 22,5% do IR");
        } else {
            System.out.println("Você se enquadrou na faixa de: 27,5% do IR");
        }
    }
}
