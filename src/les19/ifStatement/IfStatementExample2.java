package les19.ifStatement;

import les17.Library.UserInput;

public class IfStatementExample2 {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        int userData = userInput.getUserInteger("Bitte geben Sie eine ganze Zahl ein: ");

        if (userData % 2 == 0) {
            System.out.println("Die Zahl " + userData +  " ist gerade.");
        } else {
            System.out.println("Die Zahl " + userData +  " ist ungerade.");
        }



    }
}
