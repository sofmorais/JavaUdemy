package app.exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01_2 {
    public static void main(String[] args) {

        /*Faça um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casa decimais. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metroQuadrado, area, preco;

        System.out.println("Digite a largura do terreno:");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno:");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metroQuadrado do terreno:");
        metroQuadrado = sc.nextDouble();
        sc.close();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("Área = %.2f %n", area);
        System.out.printf("Preço = %.2f %n", preco);

    }
}
