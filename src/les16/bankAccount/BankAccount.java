package les16.bankAccount;

public class BankAccount {

    String accountNumber;
    double balance;

    public void printBalance() {
        System.out.println("Aktueller Kontostand: " + balance);
    }


    public void withDraw(double amount) {
        balance = balance - amount;
        System.out.println("Vom Konto wurden " + amount + " Euro abgebucht");
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Dem  Konto wurden " + amount + " Euro gutgeschrieben");
    }
}
