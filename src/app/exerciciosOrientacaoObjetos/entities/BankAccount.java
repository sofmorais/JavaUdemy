package app.exerciciosOrientacaoObjetos.entities;

import java.util.UUID;

public class BankAccount {

    private UUID numeroConta = UUID.randomUUID();
    private String titular;
    private double balance;

    public BankAccount(UUID numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public BankAccount(UUID numeroConta, String titular, double balance) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public UUID getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public String setTitular(String titular) {
        return this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    public String toString() {
        return "Account number: " + numeroConta.toString() + ", "
                + "Holder: " + titular + ", "
                + "Balance: $" + balance;
    }


}
