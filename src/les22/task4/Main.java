package les22.task4;

public class Main {
    public static void main(String[] args) {

        String hello = "Hello";
        System.out.println(hello.toLowerCase());
        System.out.println(hello.toUpperCase());

        String userName1 = "User";
        String userName2 = "useR";

        if (userName1.toLowerCase().equals(userName2.toLowerCase())) {
            System.out.println("Begriffe sind gleichwertig");
        } else {
            System.out.println("Die Begriffe sind nicht gleichwertig");
        }


        String greeting = "Hello John!";
        String goodbye = "Good Bye!";
        System.out.println("Gibt es eine greeting-Begrüßung - ?" + greeting.startsWith("Hello"));
        System.out.println("Gibt es eine goodbye-Begrüßung - ?" + goodbye.startsWith("Hello"));

    }
}
