public class Main6 {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("口座番号" + account.accountNumber);
        account.deposit();
        account.withdraw();
    }
}
