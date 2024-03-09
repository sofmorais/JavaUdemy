package exerciciosEstruturaSequencial;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Digite o valor de a:");
        a = sc.nextInt();
        System.out.println("Digite o valor de b:");
        b = sc.nextInt();
        System.out.println("Digite o valor de c:");
        c = sc.nextInt();
        System.out.println("Digite o valor de d:");
        d = sc.nextInt();

        diferenca = a * b - c * d;

        System.out.println("Diferença: " + diferenca);
        sc.close();
    }
}
