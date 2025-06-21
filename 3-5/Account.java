public class Account {
    int accountNumber;
    int balance;

   public Account(){
        accountNumber = 12345;
        balance = 0;
    }
    public void deposit(){
        balance += 1000;
        System.out.println("残高：" + this.balance + "円");
    }
    public void withdraw(){
        balance -= 500;
        System.out.println("出勤後残高：" + this.balance + "円");
    }
}
