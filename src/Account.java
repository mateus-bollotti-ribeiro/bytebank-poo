package bytebankpoo.src;

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

        System.out.println("Conta criada na Agência " + this.agency + " com o número " + this.number);
        System.out.println("O número total de contas criadas até o momento é de: " + Account.total);
        System.out.println(" ");
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdrawalLimit(double value) {
        double limit = 1000;

        if (value <= limit) {
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawal(double value) {
        if (withdrawalLimit(value)) {
            System.out.println("Valor acima do limite diário");
            return false;
        }
        if (value > balance) {

            System.out.println("Saldo Insuficiente");
            return false;
        } else {
            balance -= value;
            return true;
        }
    }

    public boolean transferLimit(double value) {
        double limit = 800;

        if (value <= limit) {
            return true;
        } else {
            System.out.println("O valor informado extrapola o valor máximo permitido para esta transação.");
            return false;
        }
    }

    public boolean transfer(double value, Account destiny) {
        if (transferLimit(value)) {
            withdrawal(value);
            destiny.deposit(value);

            System.out.println("A transferência foi bem-sucedida.");

            return true;
        } else {
            return false;
        }
    }

    //GETTERS E SETTERS

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