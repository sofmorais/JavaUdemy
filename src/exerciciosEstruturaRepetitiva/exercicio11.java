package exerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        // Faça um programa para ler três números inteiros e mostrar na tela o maior deles.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    private static void showResult(int value) {
        System.out.println("Higher: " + value);
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }
}
