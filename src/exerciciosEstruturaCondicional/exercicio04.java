package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número:");
        numero = sc.nextInt();;

        if (numero < 0 ) {
            System.out.println("NEGATIVO!");
        }
        else {
            System.out.println("POSITIVO!");
        }

        sc.close();
    }
}
