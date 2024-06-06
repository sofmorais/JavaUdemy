package app.exerciciosOrientacaoObjetos;

import app.exerciciosOrientacaoObjetos.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        // Fazer um programa para ler os dados de um funcionário (nome, salário e imposto) e mostrar os dados. Em seguida, aumentar o salário com base em uma porcentagem dada (somente o salário bruto é afetado na porcentagem e mostar os dados novamente. Use uma classe.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee:" + employee);
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
