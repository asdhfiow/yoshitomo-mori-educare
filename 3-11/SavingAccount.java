public interface SavingAccount {
    void deposit(int amount);
    void withdraw(int amount);
    void displayAccountInfo();
    int getBalance();
}