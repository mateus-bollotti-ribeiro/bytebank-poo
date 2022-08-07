package bytebankpoo;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;

        System.out.println("Conta criada na Agência " + this.agencia + " com o número " + this.numero);
        System.out.println("O número total de contas criadas até o momento é de: " + Conta.total);
        System.out.println(" ");
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean limiteSaque(double valor) {
        double limite = 1000;

        if (valor <= limite) {
            return true;
        } else {
            return false;
        }
    }

    public boolean saca(double valor) {
        if (limiteSaque(valor)) {
            System.out.println("Valor acima do limite diário");
            return false;
        }
        if (valor > saldo) {

            System.out.println("Saldo Insuficiente");
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    public boolean limiteTransferencia(double valor) {
        double limite = 800;

        if (valor <= limite) {
            return true;
        } else {
            System.out.println("O valor informado extrapola o valor máximo permitido para esta transação.");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (limiteTransferencia(valor)) {
            saca(valor);
            destino.deposita(valor);

            System.out.println("A transferência foi bem-sucedida.");

            return true;
        } else {
            return false;
        }
    }

    //GETTERS E SETTERS

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}