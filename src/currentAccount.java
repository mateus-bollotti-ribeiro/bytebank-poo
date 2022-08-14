package bytebankpoo.src;

public final class currentAccount extends Account {

    public currentAccount(Client holder, int agency, int number) {
        super(holder, agency, number);
    }

    @Override
    public boolean withdrawal(double value) {
        double amountToWithdraw = value + 0.2;
        return super.withdrawal(amountToWithdraw);
    }
}
