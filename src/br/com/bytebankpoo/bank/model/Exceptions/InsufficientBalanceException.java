package bytebankpoo.src.br.com.bytebankpoo.bank.model.Exceptions;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
