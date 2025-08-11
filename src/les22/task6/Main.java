package les22.task6;

public class Main {
    public static void main(String[] args) {

        String document1 = "005;erstellt;Konto";
        String document2 = "005;gesendet;Konto";
        String document3 = "005; erfüllt;Konto";

        System.out.println("Dokumentstatus 1 - " + document1.substring(4, 13).trim());
        System.out.println("Dokumentstatus 2 - " + document2.substring(4, 13).trim());
        System.out.println("Dokumentstatus 3 - " + document3.substring(4, 13).trim());


    }
}
