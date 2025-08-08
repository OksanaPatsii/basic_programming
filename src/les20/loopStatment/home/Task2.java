package les20.loopStatment.home;

import les17.Library.UserInput;

public class Task2 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int sum = 0;
        boolean condition = true;

        while (condition) {
            int num = ui.getUserInteger("Geben Sie die Anzahl ein.");
            if (num < 0){
                condition = false;
            }
            sum += num;
        }
        System.out.println("Die Summe der eingegebenen Zahlen = " + sum);
    }
}
