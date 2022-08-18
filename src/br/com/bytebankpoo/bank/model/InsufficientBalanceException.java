package bytebankpoo.src.br.com.bytebankpoo.bank.model;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
