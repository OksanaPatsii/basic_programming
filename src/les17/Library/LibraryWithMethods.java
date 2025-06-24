package les17.Library;

public class LibraryWithMethods {
    public static void main(String[] args) {

    UserInput ui = new UserInput();

        String bookTitle = ui.getUserText("Geben Sie den Titel des Buches ein");

        String bookAuthor = ui.getUserText("Geben Sie den Autor des Buches ein");

        String genreTitle = ui.getUserText("Geben Sie das Genre des Buches ein");

        Book book1 = new Book(bookTitle, bookAuthor, genreTitle);
        book1.printBookInfo();



    }




}
