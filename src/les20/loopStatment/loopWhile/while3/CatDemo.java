package les20.loopStatment.loopWhile.while3;

import les17.Library.UserInput;

public class CatDemo {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        boolean condition = true;

        while (condition) {
            String catName = ui.getUserText("Geben Sie den Namen Ihres Haustiers ein: ");

            if (catName.equals("")){
                condition = false;
            } else {
                Cat cat = new Cat(catName);
                System.out.println("Ihr Haustier " + cat.getName() + " ist registriert");
            }
        }

        System.out.println("Der Zyklus der Eingabedaten und Katzen ist abgeschlossen");
    }
}
