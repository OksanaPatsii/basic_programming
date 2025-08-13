package les23.task1;


public class Task1vers2 {
    public static void main(String[] args) {

        BookService service = new BookService();

        int searchBookCounter = 0;
        int bookQuantity = service.getBookQuantity();

        for (int i = 1; i <= bookQuantity; i++) {
            System.out.println("Eingabe der Daten zur Buchnummer " + i);

            Book creaetedBook = service.creaeteNewBook();

            if (service.checkAuthor(creaetedBook, "Duma")) {
                searchBookCounter++;
            }
        }
        System.out.println("In Ihrer Bibliothek befinden sich " + searchBookCounter + " Bücher von Dumas.");
    }
}