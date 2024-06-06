package app.exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {
    public static void main (String[] args) {
       /* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;
        pi = 3.14159;

        System.out.println("Digite o valor de A:");
        a = sc.nextDouble();
        System.out.println("Digite o valor de B:");
        b = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        c = sc.nextDouble();

        areaTriangulo = a * c / 2.0;
        areaCirculo = pi * c * c;
        areaTrapezio = (a + b) / 2.0 * c;
        areaQuadrado = b * b;
        areaRetangulo = a * b;

        System.out.printf("Área do triangulo: %.3f%n", areaTriangulo);
        System.out.printf("Área do circulo: %.3f%n", areaCirculo);
        System.out.printf("Área do trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Área do quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Área do retangulo: %.3f%n", areaRetangulo);

        sc.close();
    }
}
