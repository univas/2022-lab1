package br.edu.univas;

public class Exercicio17 {

    public static void main(String[] args) {
        float valorMensalidade = 1000.0f;
        int semestres = 8;
        float porcentagemAumento = 0.05f;

        for (int i = 0; i < semestres - 1; i++) {
            float valorAumento = valorMensalidade * porcentagemAumento;
            valorMensalidade += valorAumento;
        }

        System.out.println("O valor da ultima mensalidade é: R$ " + valorMensalidade);
    }
}
