package les38.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Beginn des Programms");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein");
        String name = scanner.nextLine();

        System.out.println("Benutzername erfolgreich gelesen");

        System.out.println("Geben Sie Ihr Alter ein");
        String stringAge = scanner.nextLine();

        System.out.println("Benutzeralter erfolgreich gelesen");

        int age = Integer.parseInt(stringAge);

        System.out.println("Alter erfolgreich in Zahl umgewandelt");

        System.out.println("Ihre Name - " + name + " Und Sie sind " + age + " Jahre alt");

        System.out.println("Das Programm wurde erfolgreich abgeschlossen");

    }
}
