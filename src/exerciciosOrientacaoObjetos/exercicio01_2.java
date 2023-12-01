package exerciciosOrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01_2 {
    public static void main(String[] args) {
        /* Faça um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas validas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui maior área. A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a fórmula de Heron. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}
