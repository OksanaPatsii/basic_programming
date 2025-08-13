package les23.task1;

import les17.Library.UserInput;

public class BookService {

    UserInput userInput = new UserInput();

    public Book creaeteNewBook() {

        String author = userInput.getUserText("Geben Sie den Autor des Buches ein");
        String title = userInput.getUserText("Geben Sie den Titel des Buches ein");

        Book newBook = new Book(author, title);
        return newBook;
    }

    public boolean checkAuthor(Book book, String compareAuthor) {
        if (book.getAuthor().equals(compareAuthor)) {
            return true;
        } else {
            return false;
        }
    }

    public int getBookQuantity() {
        int bookQuantity = userInput.getUserInteger("Geben Sie die Anzahl der Bücher ein");
        return bookQuantity;
    }
}
