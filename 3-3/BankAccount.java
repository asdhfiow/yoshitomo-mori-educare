public class BankAccount {

    private int balance; // 残高のフィールド

    // 残高を取得するメソッド
    public int getBalance() {
        return balance;
    }

    // 残高を設定するメソッド（初期化用）
    public void setBalance(int amount) {
        this.balance = amount;
    }

    // 預け入れメソッド
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "円預けました");
    }

    // 引き出しメソッド
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "円引き出しました");
        } else {
            System.out.println("残高が不足しています");
        }
    }
}
