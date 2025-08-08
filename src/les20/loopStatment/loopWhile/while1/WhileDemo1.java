package les20.loopStatment.loopWhile.while1;

import les17.Library.UserInput;

public class WhileDemo1 {
    public static void main(String[] args) {


        UserInput ui = new UserInput();

        int result = 0;

        while (result < 100) {
            System.out.println("Geben Sie 2 Ganzzahlen ein");
            int x = ui.getUserInteger("Geben Sie die erste Zahl ein");
            int y = ui.getUserInteger("Geben Sie die zweite Zahl ein");

            result = x + y;
            System.out.println("Additionsergebnis = " + result);
        }

        System.out.println("der Zyklus hat seine Arbeit abgeschlossen");
    }
}
