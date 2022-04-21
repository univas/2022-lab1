package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        int anoNascimento = 2000;

        int anoAtual = 2022;

        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade);

        int a = 11;
        int b = 2;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        System.out.println(f);
        int g = a % b;
        System.out.println(g);
        float h = (float) a / b;
        System.out.println(h);

        int j = 10;

        String nome = "Rodrigo";

        System.out.println("10 " + j);
        System.out.println(j + " 10");
        System.out.println("Nome: " + nome + " idade: " + idade);

        j = j + 1;
        j++;
        System.out.println(j);

        j = j - 1;
        j--;
        System.out.println(j);

        j = 22;
        System.out.println(j);

        System.out.println("--------------");
        int abc = 10;
        System.out.println(abc);
        abc++;
        System.out.println(abc);
        abc--;
        System.out.println(abc);

        System.out.println(abc++);
        System.out.println(abc);

        System.out.println(++abc);
        System.out.println(abc);

        System.out.println(--abc);
        System.out.println(abc);

        System.out.println("------------------------");
        int x = 10;
        System.out.println(x);
        x = x + 15;
        System.out.println(x);
        x += 15;
        System.out.println(x);
        x -= 15;
        System.out.println(x);
        x *= 2;
        System.out.println(x);
        x /= 3;
        System.out.println(x);
    }

}
