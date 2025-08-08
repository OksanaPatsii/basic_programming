package les20.loopStatment.loopWhile.while2;

import les17.Library.UserInput;

public class CatDemo {
    public static void main(String[] args) {
//        UserInput ui = new UserInput();
//        int counter = 0;
//        while (counter < 3){
//
//            String catName = ui.getUserText("Geben Sie den Namen Ihres Haustiers ein: ");
//
//            Cat myCat = new Cat(catName);
//            System.out.println("Die Katze:" + myCat.getName() + " ist im Besucherbuch mit der Nummer " + counter + " eingetragen");
//            counter++;
//        }

        CatService service = new CatService();
        int counter = 0;
        while (counter < 3){
            Cat myCat = service.createNewCat();
            System.out.println("Die Katze:" + myCat.getName() + " ist im Besucherbuch mit der Nummer " + counter + " eingetragen");
            counter++;

        }

    }
}
