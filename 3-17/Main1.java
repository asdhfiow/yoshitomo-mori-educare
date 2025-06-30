public class Main1 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000);

        System.out.println("残高：" + ba.getBalance() + "円");
        ba.deposit(2000);
        System.out.println("残高：" + ba.getBalance() + "円");

        ba.withdraw(1500);  
        System.out.println("残高：" + ba.getBalance() + "円");

        ba.withdraw(3000); 
        System.out.println("残高：" + ba.getBalance() + "円");
    }
}
