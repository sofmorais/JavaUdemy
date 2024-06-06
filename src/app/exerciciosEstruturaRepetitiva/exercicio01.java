package app.exerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Faça um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números.

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
