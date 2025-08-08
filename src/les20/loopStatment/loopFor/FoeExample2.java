package les20.loopStatment.loopFor;

import les17.Library.UserInput;

public class FoeExample2 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        int numberOfIteration = ui.getUserInteger("Geben Sie die Anzahl der Ziffern ein.");

        int sum = 0;

        for (int i = 0; i < numberOfIteration; i++) {
            int userInt = ui.getUserInteger("Geben Sie eine Ganzzahl ein");

            if (userInt > 0) {
                System.out.println(userInt + " - die Anzahl werden zum Gesamtbetrag addiert");
                sum = sum + userInt;
            } else {
                System.out.println(userInt + " negative Zahl wird ignoriert");
            }
        }

            System.out.println("Die Summe aller positive Zahlen ist " + sum);
    }
}
