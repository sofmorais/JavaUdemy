package app.exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main (String[] args) {
        /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais.

        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159 */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        System.out.println("Digite o valor do raio do círculo:");
        raio = sc.nextDouble();

        area = pi * raio * raio;
        System.out.printf("Área: %.4f", area);

        sc.close();
    }
}
