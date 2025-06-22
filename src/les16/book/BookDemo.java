package les16.book;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Im Beruf NEU B1", "Annette Müller", true);
        Book book2 = new Book("Python für absolute Anfänger", "Elias", false);

        book1.printInfo();
        book1.lendBook();
        book1.printInfo();
        book1.returnBook();
        book1.printInfo();

        book2.printInfo();
        book2.lendBook();
        book2.printInfo();
        book2.returnBook();
        book2.printInfo();



    }
}
