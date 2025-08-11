package les22.task2;

import java.util.Scanner;

public class CheckWordsLength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Spieler 1, geben das Wort ein");
        String userWord1 = scanner.nextLine();
        System.out.println("Spieler 2, geben das Wort ein");
        String userWord2 = scanner.nextLine();

        if (userWord1.length() == userWord2.length()) {
            System.out.println("Ihre Wörter sind gleich lang");
        } else {
            System.out.println("Ihre Wörter sind unterschiedlich lang");
        }

    }
}
