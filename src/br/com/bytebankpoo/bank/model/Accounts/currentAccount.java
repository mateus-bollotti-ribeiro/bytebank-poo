package bytebankpoo.src.br.com.bytebankpoo.bank.model.Accounts;

import bytebankpoo.src.br.com.bytebankpoo.bank.model.Client.Client;

public final class currentAccount extends Account {

    public currentAccount(Client holder, int agency, int number) {
        super(holder, agency, number);
    }

    @Override
    public void withdraw(double value) throws Exception {
        double amountToWithdraw = value + 0.2;
        super.withdraw(amountToWithdraw);
    }
}
