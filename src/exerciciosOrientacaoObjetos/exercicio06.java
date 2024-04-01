package exerciciosOrientacaoObjetos;

import exerciciosOrientacaoObjetos.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar price?");
        converter.dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        converter.amount = sc.nextDouble();

        System.out.println("Amount to be paid in reais: " + converter.dollarPrice);
        sc.close();
    }
}
