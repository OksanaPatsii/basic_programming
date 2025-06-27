package les18.publicAndPrivate.home.task5;

public class BookshelfDemo {
    public static void main(String[] args) {
        Bookshelf bookshelf1 = new Bookshelf("Heimbibliothek", 50);
        bookshelf1.printInfoBook();

        bookshelf1.addBooks(20);
        bookshelf1.printInfoBook();

        bookshelf1.removeBooks(10);
        bookshelf1.printInfoBook();

        bookshelf1.removeBooks(60);
        bookshelf1.printInfoBook();

    }
}
