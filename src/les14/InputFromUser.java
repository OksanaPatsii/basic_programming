package les14;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Text ein");

        String myText = scanner.nextLine();

        System.out.println("Geben Sie eine Nummer ein");

        int x = scanner.nextInt();

        scanner.close();

        System.out.println("Sie haben die Zahl: " + x + " eingegeben");
        System.out.println("Sie haben Text: " + myText + " eingegeben");

    }
}
