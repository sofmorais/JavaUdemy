package app.exerciciosOrientacaoObjetos;

import app.exerciciosOrientacaoObjetos.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int option;

        BankAccount bank = new BankAccount();

        do {
            exibirMenu();
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Account number: " + bank.getNumeroConta());
                    System.out.print("Enter account holder: ");
                    String titular = sc.nextLine();

                    bank.setTitular(titular);

                    System.out.println("Is there a initial deposit (y/n)?");
                    char initialDeposit = sc.next().charAt(0);

                    if (initialDeposit == 'y') {
                        System.out.println("Enter initial deposit value:");
                        bank.deposit(sc.nextDouble());
                        sc.nextLine();
                    }

                    System.out.println("Account data: " + bank.toString());
                    break;

                case 2:
                    System.out.println("Enter a deposit value: ");
                    bank.deposit(sc.nextDouble());
                    System.out.println("Updated account data:" + bank.toString());
                    break;

                case 3:
                    System.out.println("Balance: " + bank.getBalance());
                    System.out.println("Enter a withdraw value: ");
                    bank.withdraw(sc.nextDouble());
                    System.out.println("Updated account data:" + bank.toString());
                    break;

                case 4:
                    System.out.println("Atual titular: " + bank.getTitular());
                    System.out.println("Novo titular: ");
                    bank.setTitular(sc.nextLine());
                    System.out.println("Updated account data:" + bank.toString());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 0);

        sc.close();
    }

    public static void exibirMenu() {
        System.out.println("1: Abrir conta");
        System.out.println("2: Realizar depósito");
        System.out.println("3: Realizar retirada");
        System.out.println("4: Atualizar titular");
        System.out.println("0: Sair");
        System.out.println("Opção escolhida: ");
    }
}
