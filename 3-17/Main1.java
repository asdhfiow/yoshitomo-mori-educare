public class Main1 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000);

        ba.getBalance();
        ba.deposit(2000);
        ba.getBalance();
        ba.withdraw(1000);
        ba.getBalance();
    }
}
