package les20.loopStatment.home;

import les17.Library.UserInput;

public class Task1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int number = ui.getUserInteger("Geben Sie die Anzahl N ein.");
        int sum = 0;


        for (int i = 0; i <= number; i++) {

            if (number % 2 ==0) {
                sum += i;
                System.out.println("die Summe aller geraden Zahlen = " + sum);
            }






        }


    }
}
