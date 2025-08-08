package les20.switchStatment;

import les17.Library.UserInput;

public class Example1 {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        String word = userInput.getUserText("Geben Sie ein beliebiges englisches Wor ein: ");

        switch (word) {
            case "coffee":
                System.out.println("Übersetzung dieses Wortes: Kaffee");
                break;
            case "hello":
                System.out.println("Übersetzung dieses Wortes: Hello");
                break;
            default:
                System.out.println("Das weiß ich noch nicht...");
        }
    }
}
