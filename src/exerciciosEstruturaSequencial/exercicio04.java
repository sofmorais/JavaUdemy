package exerciciosEstruturaSequencial;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.println("Digite o valor de a: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        B = sc.nextInt();
        System.out.println("Digite o valor de c: ");
        C = sc.nextInt();
        System.out.println("Digite o valor de d: ");
        D = sc.nextInt();

        diferenca = A * B - C * D;

        System.out.println("Diferença: " + diferenca);
        sc.close();
    }
}
