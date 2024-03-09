package exerciciosEstruturaSequencial;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main (String[] args) {
        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        double precoPeca1, precoPeca2, valorTotal;

        System.out.println("Digite o código da peça 1:");
        codigoPeca1 = sc.nextInt();
        System.out.println("Digite a quantidade de peças 1:");
        quantidadePeca1 = sc.nextInt();
        System.out.println("Digite o valor da peça 1:");
        precoPeca1 = sc.nextDouble();
        System.out.println("Digite o código da peça 2:");
        codigoPeca2 = sc.nextInt();
        System.out.println("Digite a quantidade de peças 2:");
        quantidadePeca2 = sc.nextInt();
        System.out.println("Digite o valor da peça 2:");
        precoPeca2 = sc.nextDouble();

        valorTotal = quantidadePeca1 * precoPeca1 + quantidadePeca2 * precoPeca2;

        String detalhesCompra = MessageFormat.format("Detalhamento: {0} peças de código {1} e {2} peças de código {3}", quantidadePeca1, codigoPeca1, quantidadePeca2, codigoPeca2);

        System.out.println(detalhesCompra);
        System.out.printf("Valor a pagar: R$%.2f%n", valorTotal);

        sc.close();
    }
}
