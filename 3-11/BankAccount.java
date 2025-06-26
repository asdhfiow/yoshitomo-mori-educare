// BankAccountクラス
public class BankAccount implements SavingAccount {
    String bankAccountName;
    int balance;
    String history = "";

    public BankAccount(String bankAccountName, int balance) {
        this.bankAccountName = bankAccountName;
        this.balance = balance;
        history += "口座作成: 初期残高 = " + balance + "\n";
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
        history += "入金: " + amount + "\n";
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        history += "出金: " + amount + "\n";
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("口座名義人: " + bankAccountName); 
        System.out.println("残高: " + balance);
        System.out.println("取引履歴:");
        System.out.print(history); 

    @Override
    public int getBalance() {
        return balance;
    }
}
