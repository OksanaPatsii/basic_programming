package les16.book;

public class Book {
    String title;
    String author;
    boolean isInTheLibrary;

    public Book(String title, String author, boolean isInTheLibrary) {
        this.title = title;
        this.author = author;
        this.isInTheLibrary = isInTheLibrary;
    }

    public void lendBook() {
        if (isInTheLibrary) {
            isInTheLibrary = false;
            System.out.println("Das Buch " + title + " wird dem Leser ausgehändigt");
        } else {
            System.out.println("Das Buch: " + title + " ist bereits erschienen");
        }
    }

    public void returnBook() {
        if (!isInTheLibrary) {
            isInTheLibrary = true;
            System.out.println("Das Buch: " + title + " an die Bibliothek zurückgegeben");
        } else {
            System.out.println("Das Buch: " + title + " ist bereits in der Bibliothek vorhanden");;
        }
    }

    public void printInfo() {
        String status = isInTheLibrary ? "in der Bibliothek" : "dem Leser ausgestellt";
        System.out.println("Das Buch: " + title + " Autor des Buches: " + author + " " + status);
    }
}
