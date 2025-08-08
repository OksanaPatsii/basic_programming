package les20.loopStatment.loopFor;

public class ExampleTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + "  ");

            for (int j = 1; j <= 3; j++) {
                System.out.print(" " + i * j);
            }
            System.out.println();
        }
    }
}
