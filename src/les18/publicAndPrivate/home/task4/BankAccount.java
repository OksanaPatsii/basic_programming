package les18.publicAndPrivate.home.task4;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
        balance += amount;
        } else {
            System.out.println("Fehler: Der Betrag muss positiv sein.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Fehler: Der Betrag muss positiv sein.");
        }
        else if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Fehler: Auf Ihrem Konto ist nicht genügend Guthaben vorhanden.");
        }
    }

    public void printAccountInfo() {
        System.out.println("Auf Konto: '" + getAccountNumber() + "', " + getBalance() + " Euro");
    }
}
