package app.exerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        /* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();

        System.out.println("Números ímpares entre: " + x);
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
