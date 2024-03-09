package exerciciosOrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01_2 {
    public static void main(String[] args) {
        /* Faça um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas validas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui maior área. A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a fórmula de Heron. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
