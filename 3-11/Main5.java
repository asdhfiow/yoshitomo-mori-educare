public class Main5 {
    public static void main(String[] args) {
        BankAccount sa = new SavingAccount("山田太郎", 10000);  // ← 多態性
        sa.deposit(5000);
        sa.withdraw(3000);
        sa.displayAccountInfo();
    }
}
