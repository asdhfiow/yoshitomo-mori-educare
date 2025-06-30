public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;  // ← 表示しない！返すだけ
    }
    // 入金
    public void deposit(int amount){
        if (amount <= 0) {
            System.out.println("エラー：入金額は正の整数で指定してください");
            return;
        }
        balance += amount;
        System.out.println(amount + "円入金しました");
    }

    // 出金
    public void withdraw(int amount){
        if (amount <= 0) {
            System.out.println("エラー：出金額は正の整数で指定してください");
            return;
        }
        if (balance < amount){
            System.out.println("引き出しに失敗しました。残高が不足しています。");
        } else {
            balance -= amount;
            System.out.println(amount + "円引き出しました");
        }
    }
}
