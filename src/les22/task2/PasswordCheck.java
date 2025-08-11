package les22.task2;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Überlegen Sie sich ein Passwort, das mindestens 8 Zeichen lang ist");
        String password = scanner.nextLine();

        if (password.length() >= 8) {
            System.out.println("Das Passwort ist korrekt");
        } else {
            System.out.println("Das Passwort ist zu kurz");
        }
    }
}

