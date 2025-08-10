package les21.task4;

public class WhileTest {

    public static void main(String[] args) {

        int value = 1;

        while (value <= 5) {
            System.out.print(value++ + " ");
        }

        System.out.println();

        value = 1;

        do {
            System.out.print(value + " ");
            value++;
        } while (value <= 5);
    }
}