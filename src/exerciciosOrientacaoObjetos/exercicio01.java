package exerciciosOrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        /* Faça um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas validas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui maior área. A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a fórmula de Heron. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do triângulo X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double areaX = calcularArea(xA, xB, xC);
        double areaY = calcularArea(yA, yB, yC);

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }
        sc.close();
    }

    public static double calcularArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }
}
