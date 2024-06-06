package app.exerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double conversao = 9 * celsius / 5 + 32;
            System.out.println("Equivalente em Fahrenheit: %.1f" + conversao);

            System.out.println("Deseja fazer outra conversão? (s/n)");
            resposta = sc.next().charAt(0);
        } while (resposta == 's');

        sc.close();
    }
}
