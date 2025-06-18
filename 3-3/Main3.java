public class Main3 {
    public static void main(String[] args){
        BankAccount account = new BankAccount(); //口座のインスタンスを作成
        account.balance = 0;//初期残高を設定

        System.out.println("残高：" + account.balance + "円");

        account.deposit(10000); //10,000円を預ける
        account.getBalance(); //残高を表示

        account.withdrow(3000); //3,000円を引き出す
        account.getBalance(); //残高を表示

        account.withdrow(8000); //8,000円を引き出す
    }
}
