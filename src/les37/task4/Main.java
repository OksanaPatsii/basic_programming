package les37.task4;

import java.util.List;

public class Main {

    public static void main(String[] args) {

     //   List<Integer> numbers = List.of(7, 3, 9, 4, 2, 8, 1, 5);
        List<Integer> numbers = List.of(7, 3, 9, 11, 3, 17, 1, 5);

        int firstEvenNumber = numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .findFirst()
                .orElse(-1);

        if (firstEvenNumber == -1) {
            System.out.println("Es gibt keine geraden Zahlen im Blatt");
        } else {
            System.out.println("die erste gerade Zahl ist - " + firstEvenNumber);
        }
    }
}
