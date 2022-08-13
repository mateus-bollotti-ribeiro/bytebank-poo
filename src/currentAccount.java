package bytebankpoo.src;

public class ContaCorrente extends Conta {

    public ContaCorrente(Client titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
