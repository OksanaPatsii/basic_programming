package les20.loopStatment.practice;

import les17.Library.UserInput;

public class Task2 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int num = ui.getUserInteger("Geben Sie die Anzahl der Ziffern ein.");

        for (int i = 0; i <= num; i++) {

            int userNum = ui.getUserInteger("Geben Sie " + i + " Nummer ein");

            if (userNum < 0 && userNum % 2 !=0) {
                System.out.println("DATENEINGABEFEHL");
            } else {
                System.out.println(userNum);
            }
        }
    }
}
