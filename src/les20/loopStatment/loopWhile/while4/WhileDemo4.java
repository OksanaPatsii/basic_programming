package les20.loopStatment.loopWhile.while4;

import les17.Library.UserInput;

public class WhileDemo4 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int sum = 0;

        int userData = 0;


        while (userData >= 0) {

            userData = ui.getUserInteger("Geben Sie eine Nummer ein");

            if (userData >= 0 ) {
                sum = sum + userData;
            }
        }

        System.out.println("die Summe aller positiven Zahlen ist " + sum);
    }
}
