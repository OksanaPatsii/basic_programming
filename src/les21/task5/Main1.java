package les21.task5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        String correctPassword = "qwe";
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        String password;
        do {
            if (counter == 5) {
                System.out.println("Anfragen beendet, Zugriff verweigert");
                return;
            }
            System.out.println("Passwort eingeben:");
            password = scanner.nextLine();
            counter++;
        } while (!correctPassword.equals(password));

        System.out.println("Das Passwort ist korrekt!");
    }
}
