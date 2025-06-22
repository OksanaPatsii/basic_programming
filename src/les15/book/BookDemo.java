package les15.book;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book myFirstBook = new Book();

        System.out.println("Geben Sie die Katalognummer des Buches ein: ");
        myFirstBook.id = scanner.nextInt();

        System.out.println("Geben Sie den Author des Buches ein:");
        scanner.nextLine();
        myFirstBook.author = scanner.nextLine();

        System.out.println("Geben Sie den Namen des Buches ein:");
        myFirstBook.title = scanner.nextLine();

        System.out.println("Geben Sie die Anzahl der Seiten im Buch ein:");
        myFirstBook.pages = scanner.nextInt();


    }
}
