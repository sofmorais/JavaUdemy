package exerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            double divisao = (double) x / y;

            if (divisao != 0) {
                System.out.printf("%.1f", divisao);
            }
            else {
                System.out.println("Divisão impossível.");
            }

        }
    }
}
