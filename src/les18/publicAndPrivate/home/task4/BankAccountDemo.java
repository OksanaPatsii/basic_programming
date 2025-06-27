package les18.publicAndPrivate.home.task4;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("123456789", 1000);
        bankAccount1.printAccountInfo();

        bankAccount1.deposit(500);
        bankAccount1.printAccountInfo();

        bankAccount1.withdraw(200);
        bankAccount1.printAccountInfo();

        bankAccount1.withdraw(2000);
        bankAccount1.printAccountInfo();

    }
}
