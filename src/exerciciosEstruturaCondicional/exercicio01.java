package exerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        /* Faça um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de uma disciplina anual. Em seguida, mostre a nota final que o aluno obteve no ano juntamente com um texto explicativo. Caso a nota do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO". Todos os valores devem ter uma casa decimal.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double notaSemestre1, notaSemestre2, notaFinal;

        System.out.println("Digite a nota do semestre 1:");
        notaSemestre1 = sc.nextDouble();
        System.out.println("Digite a nota do semestre 2:");
        notaSemestre2 = sc.nextDouble();

        notaFinal = notaSemestre1 + notaSemestre2;

        if (notaFinal < 60.00) {
            System.out.println("REPROVADO!");
        }

        System.out.printf("A nota final do aluno é: %.1f", notaFinal);

        sc.close();
    }
}
