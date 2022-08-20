package bytebankpoo.src.br.com.bytebankpoo.bank.model.Accounts;

import bytebankpoo.src.br.com.bytebankpoo.bank.model.Client.Client;
import bytebankpoo.src.br.com.bytebankpoo.bank.model.Exceptions.InsufficientBalanceException;

public abstract sealed class Account
        permits currentAccount, savingsAccount {
    private double balance;
    private final int agency;
    private final int number;
    private final Client holder;
    private static int total;

    public Account(Client holder, int agency, int number) {
        Account.total++;
        this.agency = agency;
        this.number = number;
        this.holder = holder;

        if(agency < 1) {
            throw new IllegalArgumentException("Agência Inválida.");
        }

        if(number < 1) {
            throw new IllegalArgumentException("Número de conta inválido.");
        }

        System.out.println("Conta criada na Agência " + this.agency + " com o número " + this.number);
        System.out.println("O número total de contas criadas até o momento é de: " + Account.total);
        System.out.println(" ");
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) throws Exception {
        if(this.balance < value) {
            throw new InsufficientBalanceException("Saldo insuficiente: R$" + this.balance + ", valor à sacar: R$" + value);
        }

        this.balance -= value;
    }


    public void transfer(double value, Account destiny) throws Exception {
        this.withdraw(value);
        System.out.println("A transferência foi bem-sucedida.");
    }

    //GETTERS E SETTERS

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }

    public int getAgency() {
        return this.agency;
    }

    public Client getHolder() {
        return holder;
    }

    public static int getTotal() {
        return Account.total;
    }
}