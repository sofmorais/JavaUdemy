package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Esse é um número par.");
        }
        else {
            System.out.println("Esse é um número ímpar.");
        }

        sc.close();
    }
}
