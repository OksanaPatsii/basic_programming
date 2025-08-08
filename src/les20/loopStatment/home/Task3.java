package les20.loopStatment.home;

import les17.Library.UserInput;

public class Task3 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int userNum = ui.getUserInteger("Geben Sie die Anzahl ein.");

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= userNum; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
            System.out.println("gerade Zahlen: " + evenCount + " ungerade Zahlen: " + oddCount);
    }
}
