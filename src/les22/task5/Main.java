package les22.task5;

public class Main {
    public static void main(String[] args) {
        String names = "John Jack Jenna Bill Samantha";
        String userName = "Jenna";

        if (names.contains(userName)) {
            System.out.println("Ihr Name steht auf der Liste");
        } else {
            System.out.println("Ihr Name steht leider nicht auf der Liste");
        }
    }
}
