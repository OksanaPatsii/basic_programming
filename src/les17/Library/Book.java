package les17.Library;

public class Book {
    String title;
    String author;
    String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void printBookInfo() {
        System.out.println("Informationen zum Buch. Name: " + title + ", Autor: " + author + ", Genre: " + genre);
    }
}
