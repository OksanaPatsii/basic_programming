package les23.task2;

import les17.Library.UserInput;

public class UserService {
    public User createUser() {
        UserInput userInput = new UserInput();

        System.out.println("Geben Sie die Daten des neuen Benutzers ein");

        String name = userInput.getUserText("Geben Sie den Namen des neuen Benutzers ein");
        String email = userInput.getUserText("Geben Sie die E-Mail-Adresse des neuen Benutzers ein");
        String password = userInput.getUserText("Passwort eingeben");

        return new User(name, email, password);
    }

    public int registration(User user, int userCounter) {
        System.out.println("Benutzer " + user + " hat sich erfolgreich registriert");
        userCounter = userCounter + 1;
        return userCounter;
    }
}
