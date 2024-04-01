package exerciciosOrientacaoObjetos;

import exerciciosOrientacaoObjetos.entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        // Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímtro e diagonal. Usar uma classe.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle retangle = new Retangle();

        System.out.println("Enter rectangle width:");
        retangle.width = sc.nextDouble();
        System.out.println("Enter rectangle height:");
        retangle.height = sc.nextDouble();

        double areaR = retangle.area();
        System.out.printf("Area: %.2f%n", areaR);

        double perimeterR = retangle.perimeter();
        System.out.printf("Perimeter: %.2f%n", perimeterR);

        double diagonalR = retangle.diagonal();
        System.out.printf("Diagonal: %.2f%n", diagonalR);

        sc.close();
    }
}
