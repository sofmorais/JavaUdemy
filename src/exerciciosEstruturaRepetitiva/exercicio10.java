package exerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        double conversao = 9 * celsius / 5 + 32;

        sc.close();
    }
}
