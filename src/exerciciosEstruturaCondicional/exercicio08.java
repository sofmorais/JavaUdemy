package exerciciosEstruturaCondicional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        // Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. Depois mostre o valor da conta a pagar.

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        System.out.println("Digite o código do produto:");
        codigo = sc.nextInt();
        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("O total foi: R$ %.2f", total);
        } else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("O total foi: R$ %.2f", total);
        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("O total foi: R$ %.2f", total);
        } else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("O total foi: R$ %.2f", total);
        } else {
            total = quantidade * 1.50;
            System.out.printf("O total foi: R$ %.2f", total);
        }

        sc.close();
    }
}
