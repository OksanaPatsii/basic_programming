package les20.loopStatment.practice;

import les17.Library.UserInput;

public class Task1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        boolean condition = true;

        while (condition) {
            int userNum = ui.getUserInteger("Geben Sie eine Nummer ein");

            if (userNum < 0 && userNum % 2 !=0) {
                System.out.println("Die Zahl ist negativ und ungerade");
                condition = false;
            } else {
                System.out.println("Sie haben " + userNum + " eingegeben");
            }

        }
    }
}
