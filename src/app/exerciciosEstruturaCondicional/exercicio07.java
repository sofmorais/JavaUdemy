package app.exerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/

        Scanner sc = new Scanner(System.in);

        int horaInicio, horaFinal, duracaoJogo;

        System.out.println("Digite o horário de início do jogo:");
        horaInicio = sc.nextInt();
        System.out.println("Digite o horário do fim do jogo:");
        horaFinal = sc.nextInt();

        if (horaInicio < horaFinal) {
            duracaoJogo = horaInicio - horaFinal;
        } else {
            duracaoJogo = 24 - horaInicio + horaFinal;
        }

        System.out.println("O jogo durou: " + duracaoJogo + " hora(s)");

        sc.close();
    }
}
