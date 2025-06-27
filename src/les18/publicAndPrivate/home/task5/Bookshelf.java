package les18.publicAndPrivate.home.task5;

public class Bookshelf {
    private String name;
    private int bookCount;

    public Bookshelf(String name, int bookCount) {
        this.name = name;
        this.bookCount = bookCount;
    }

    public String getName() {
        return name;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void addBooks(int count) {
        if (count > 0) {
            bookCount += count;
        } else {
            System.out.println("Fehler: Die Anzahl muss positiv sein.");
        }
    }

    public void removeBooks(int count) {
        if (count <= 0) {
            System.out.println("Fehler: Die Anzahl muss positiv sein.");
        } else if (count <= bookCount) {
            bookCount -= count;
        } else {
            System.out.println("Es sind nicht genügend Bücher im Schrank.");
        }
    }

    public void printInfoBook() {
        if (bookCount > 0) {
            System.out.println("Im Schrank '" + name + "' befinden sich " + bookCount + " Bücher.");
        } else {
            System.out.println("Im Schrank '" + name + "' befinden sich keine Bücher.");        }
    }
}
