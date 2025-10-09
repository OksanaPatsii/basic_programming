package les41.task1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Beginn des Programms");

        int x = 10;
        int y = 0;

        try {
            System.out.println("Beginn des Try-Blocks");
            int result = x / y;
            System.out.println("Ergebnis - " + result);

            System.out.println("Ende des Try-Blocks");
        } catch (ArithmeticException e) {
            System.out.println("Beginn des catch-Blocks");

            System.out.println("Fehler! - " + e.getMessage());

            System.out.println("Ende des Catch-Blocks");
        } finally {
            System.out.println("****Der finally-Block funktioniert****");
        }
        System.out.println("Das Programm wurde erfolgreich abgeschlossen.");
    }
}
