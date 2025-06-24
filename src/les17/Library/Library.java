package les17.Library;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Titel des Buches ein");
        String bookTitle = scanner.nextLine();

        System.out.println("Geben Sie den Autor des Buches ein");
        String bookAuthor = scanner.nextLine();

        System.out.println("Geben Sie das Genre des Buches ein");
        String genreTitle = scanner.nextLine();

        Book book1 = new Book(bookTitle, bookTitle, genreTitle);

        book1.printBookInfo();

        scanner.close();

    }
}
