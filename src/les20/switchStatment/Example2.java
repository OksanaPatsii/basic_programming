package les20.switchStatment;

import les17.Library.UserInput;

public class Example2 {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int number = userInput.getUserInteger("Geben Sie eine Zahl zwischen 1 und 10 ein: ");

        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Bereich von 1 bis 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Bereich von 4 bis 6");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Bereich von 7 bis 10");
                break;
            default:
                System.out.println("Die Nummer liegt außerhalb des gültigen Bereichs...");
        }

        if (number >=1 && number <=3){
            System.out.println("Bereich von 1 bis 3");
        }
        if (number >=4 && number <=6){
            System.out.println("Bereich von 4 bis 6");
        }
        if (number >=7 && number <=10){
            System.out.println("Bereich von 7 bis 10");
        }
    }
}
