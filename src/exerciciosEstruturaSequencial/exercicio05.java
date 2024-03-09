package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main (String[] args) {
        /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int matriculaFuncionario;
        double horasTrabalhadas, valorPorHora, salario;

        System.out.println("Digite a matrícula do funcionário:");
        matriculaFuncionario = sc.nextInt();
        System.out.println("Digite as horas trabalhadas:");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Digite o valor por hora:");
        valorPorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorPorHora;
        System.out.println("Matrícula:" + matriculaFuncionario);
        System.out.printf("O salário do funcionário será: U$ %.2f", salario);

        sc.close();
    }
}
