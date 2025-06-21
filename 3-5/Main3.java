public class Main3 {
    public static void main(String[] args) {
        BankAccount account1;
        account1 = new BankAccount();
        account1.balance = 3000;

        BankAccount account2 = account1;
        account2.balance = account1.balance;
        account2.balance = 4000;

        System.out.println("口座１の残高：" + account1.balance);
        System.out.println("口座２の残高：" + account2.balance);

        
    }
}
