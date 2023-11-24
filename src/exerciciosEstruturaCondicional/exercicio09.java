package exerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        /* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.println("Digite o número:");
        numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100) {
            System.out.println("O número está fora do intervalo.");
        } else if (numero <= 25.0) {
            System.out.println("O número está no intervalo entre (0, 25).");
        } else if (numero <= 50.0) {
            System.out.println("O número está no intervalo entre (25, 50).");
        } else if (numero <= 75.0) {
            System.out.println("O número está no intervalo entre (50, 75).");
        } else {
            System.out.println("O número está no intervalo entre (75, 100).");
        }

        sc.close();
    }
}
