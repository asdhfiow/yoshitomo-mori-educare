public class Main3 {
    public static void main(String[] args){
        BankAccount account = new BankAccount(); // 口座のインスタンスを作成
        account.setBalance(0); // 初期残高を設定

        System.out.println("残高：" + account.getBalance() + "円");

        account.deposit(10000); // 10,000円を預ける
        System.out.println("残高：" + account.getBalance() + "円");

        account.withdraw(3000); // 3,000円を引き出す
        System.out.println("残高：" + account.getBalance() + "円");

        account.withdraw(8000); // 8,000円を引き出す
        System.out.println("残高：" + account.getBalance() + "円");
    }
}
