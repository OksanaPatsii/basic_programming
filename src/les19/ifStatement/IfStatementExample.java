package les19.ifStatement;

import les17.Library.UserInput;

public class IfStatementExample {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        int userData = userInput.getUserInteger("Bitte geben Sie eine ganze Zahl ein: ");

        if (userData < 0) {
            System.out.println("eine negative Zahl ausgeben");
        } else if (userData < 100){
            System.out.println("Sie haben eine Zahl zwischen 0 und 100 eingegeben.");
        } else if (userData < 1000) {
            System.out.println("Sie haben eine Zahl zwischen 100 und 1100 eingegeben.");
        } else {
            System.out.println("Sie haben eine positive Zahl ab 1000 eingegeben.");
        }



    }
}
