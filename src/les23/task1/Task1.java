package les23.task1;

import les17.Library.UserInput;

public class Task1 {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        int bookQuantity = userInput.getUserInteger("Geben Sie die Anzahl der Bücher ein");
        int searchBookCounter = 0;

        for (int i = 1; i <= bookQuantity; i++) {
            System.out.println("Eingabe der Daten zur Buchnummer " + i);
            String author = userInput.getUserText("Geben Sie den Autor des Buches ein");
            String title = userInput.getUserText("Geben Sie den Titel des Buches ein");

            Book newBook = new Book(author, title);

            if (newBook.getAuthor().equals("Duma")) {
                searchBookCounter++;
            }
        }
        System.out.println("In Ihrer Bibliothek befinden sich " + searchBookCounter + " Bücher von Dumas.");
    }
}