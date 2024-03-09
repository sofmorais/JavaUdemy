package exerciciosEstruturaSequencial;

import java.util.Locale;

public class exercicio01 {
    public static void main(String[] args) {
        /*Faça um programa com as medidas de largura e comprimento de um terreno retangular com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casa decimais. */

        double area;
        double preco;

        double largura = 10.0;
        double comprimento = 30.0;
        double metroQuadrado = 200.00;

        area = largura * comprimento;
        preco = area * metroQuadrado;

        Locale.setDefault(Locale.US);
        System.out.printf("Área = %.2f %n", area);
        System.out.printf("Preço = %.2f %n", preco);
    }
}
