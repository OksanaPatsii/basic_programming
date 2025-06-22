package les16.bankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.accountNumber = "211121212121";
        account1.balance = 5000;

        account1.printBalance();

        double amount = 350;
        account1.withDraw(amount);
        account1.printBalance();

        account1.deposit(50);
        account1.printBalance();

        account1.deposit(130);
    }
}
