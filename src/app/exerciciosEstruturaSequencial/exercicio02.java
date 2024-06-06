package app.exerciciosEstruturaSequencial;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros e depois mostrar na tela a soma desses números.

        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite o valor de a:");
        a = sc.nextInt();
        System.out.println("Digite o valor de a:");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("Soma: " + soma);
        sc.close();
    }
}
