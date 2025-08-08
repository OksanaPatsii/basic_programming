package les20.loopStatment.loopWhile.while2;

import les17.Library.UserInput;

public class CatService {

    public Cat createNewCat() {

        UserInput ui = new UserInput();


        String catName = ui.getUserText("Geben Sie den Namen Ihres Haustiers ein: ");

        Cat createCat = new Cat(catName);

        return createCat;
    }
}
