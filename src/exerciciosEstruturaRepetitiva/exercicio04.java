package exerciciosEstruturaRepetitiva;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        /* Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "Muito obrigado." e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo. */

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool = alcool + 1;
            } else if (codigo == 2) {
                gasolina = gasolina + 1;
            } else if (codigo == 3) {
                diesel = diesel + 1;
            }
            codigo = sc.nextInt();
        }

        System.out.println("Muito obrigado.");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
