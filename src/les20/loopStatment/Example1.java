package les20.loopStatment;

import les17.Library.UserInput;

public class Example1 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int number1 = ui.getUserInteger("Geben Sie die erste Zahl ein");
        int number2 = ui.getUserInteger("Geben Sie die zweite Zahl ein");
        int number3 = ui.getUserInteger("Geben Sie die dritte Zahl ein");

        int sum = number1 + number2 + number3;

        System.out.println("Die Summe der eingegebenen Zahlen ist: " + sum);

    }
}
