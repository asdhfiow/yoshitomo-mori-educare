public class Main5 {
    public static void main(String[] args) {
        SavingAccount sa = new BankAccount("山田太郎", 10000);
        sa.deposit(5000);
        sa.withdraw(3000);
        sa.displayAccountInfo();

    }
}
