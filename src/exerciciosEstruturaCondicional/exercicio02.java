package exerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        /* Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem "Impossível calcular", caso haja uma divisão por 0 ou raiz de número negativo. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite o valor de A:");
        a = sc.nextDouble();
        System.out.println("Digite o valor de B:");
        b = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        c = sc.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (a == 0 || delta < 0) {
            System.out.println("Impossível calcular!");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

        sc.close();
    }
}
