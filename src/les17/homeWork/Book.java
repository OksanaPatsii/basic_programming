package les17.homeWork;

public class Book {
    public String title;
    public String author;
    public int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void printDescription() {
        System.out.println("Titel: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}
