public class BankAccount {
    private int balance;

    public BankAccount(int balance){
    this.balance = balance;
    }
    public int getBalance(){
        System.out.println("残高：" + balance + "円");
        return balance;
    }

    // 入金
    public void deposit(int amount){
        balance += amount;
        System.out.println(amount + "円入金しました");
    }
    // 出金　残高不足の場合は、出金不可
    public void withdraw(int amount){
        balance -= amount;
        if (balance < amount){
            System.out.println("引き出しに失敗しました。残高が不足しています。");
        }else {
            System.out.println(amount + "円引き出しました");
        }
    
    }
}

