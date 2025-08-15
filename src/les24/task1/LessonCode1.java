package les24.task1;

import les17.Library.UserInput;

public class LessonCode1 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        int userData1 = userInput.getUserInteger("Geben Sie die erste Zahl ein");
        int userData2 = userInput.getUserInteger("Geben Sie die zweite Zahl ein");
        int userData3 = userInput.getUserInteger("Geben Sie die dritte Zahl ein");

        System.out.println("Zahlen: " + userData1 + ", " + userData2 + ", " + userData3);

        int loopQuantity = 3;
        for (int i = 0; i < loopQuantity; i++) {
            int userData = userInput.getUserInteger("Geben Sie eine Nummer ein: ");

            System.out.println("Ihre Number: " + userData);
        }
    }
}
