package bytebankpoo.src;

public class Testes {
    public static void main(String[] args) throws Exception {

        Client mateus = new Client("Mateus", "000.000.000-00", "Programador Java", "Masculino", "Solteiro");
        Client samuel = new Client("Samuel", "111.111.111-11", "Médico", "Masculino", "Solteiro");

        currentAccount cc2 = new currentAccount(samuel, 44, 90);

        currentAccount cc = new currentAccount(mateus, 33, 98);
        savingsAccount cp = new savingsAccount(mateus, 33, 65);

        cc.deposit(100.0);

        try {
            cc.transfer(110.0, cc2);
        } catch(InsufficientBalanceException ex) {
            System.out.println("InsufficientBalanceException: " + ex.getMessage());
        }
        System.out.println("Seu saldo agora é de: R$" + cc.getBalance());
    }
}