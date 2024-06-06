package app.exerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Faça um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o valor do primeiro número:");
        a = sc.nextInt();
        System.out.println("Digite o valor do segundo número:");
        b = sc.nextInt();
        System.out.println("Digite o valor do terceiro número:");
        c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("Número menor =" + a);
        } else if (b < c) {
            System.out.println("Número menor =" + b);
        } else {
            System.out.println("Número menor =" + c);
        }

        sc.close();
    }
}
