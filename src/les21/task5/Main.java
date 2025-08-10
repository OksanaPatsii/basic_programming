package les21.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String correctPassword = "qwe";

        Scanner scanner = new Scanner(System.in);

        String password;
        do {
            System.out.println("Passwort eingeben:");
            password = scanner.nextLine();
        } while (!correctPassword.equals(password));

        System.out.println("Das Passwort ist korrekt!");
    }
}
