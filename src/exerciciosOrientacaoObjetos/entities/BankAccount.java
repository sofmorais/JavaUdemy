package exerciciosOrientacaoObjetos.entities;

import java.util.UUID;

public class BankAccount {
    private UUID numeroConta;
    public String titular;
    private int balance;

    public BankAccount() {

    }

    public BankAccount(UUID numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public UUID getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(UUID numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
