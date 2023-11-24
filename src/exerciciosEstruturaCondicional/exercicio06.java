package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente. */

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o valor de a:");
        a = sc.nextInt();
        System.out.println("Digite o valor de b:");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Esses são números multiplos.");
        }
        else {
            System.out.println("Esses não são números multiplos.");
        }

        sc.close();
    }
}
