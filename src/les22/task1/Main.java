package les22.task1;

public class Main {
    public static void main(String[] args) {

        String hello = "Hello world!";

        System.out.println(hello);

        String correctPass = "asd";
        String userPass = "asd";

        if (correctPass.equals(userPass)) {
            System.out.println("Das Passwort ist korrekt");
        } else {
            System.out.println("Das Passwort ist falsch");
        }
    }
}
