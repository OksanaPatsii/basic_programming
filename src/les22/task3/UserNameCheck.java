package les22.task3;

import java.util.Scanner;

public class UserNameCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Benutzernamen eingeben");
        String userName = scanner.nextLine();

        userName = null;

        if (userName == null || userName.trim().isEmpty()) {
            System.out.println("Fehler! Benutzername darf nicht leer sein");
        } else {
            System.out.println("Benutzername ist korrekt");
        }

        checkUserName(null);
    }

    public static boolean checkUserName(String userName) {
        if (userName == null || userName.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
