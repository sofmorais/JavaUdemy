package exerciciosOrientacaoObjetos;

import exerciciosOrientacaoObjetos.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        /* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("Nota1: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Nota2: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Nota3: ");
        student.grade3 = sc.nextDouble();

        double finalGrade = student.finalGrade();
        System.out.println("Final grade: "+ finalGrade);

        if (finalGrade < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f points %n", student.points());
        }
        else {
            System.out.println("Pass");
        }

        System.out.println();
        sc.close();
    }
}
