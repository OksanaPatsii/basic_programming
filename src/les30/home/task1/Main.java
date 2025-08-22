package les30.home.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        //       Aufgabe 1:
        //Erstelle eine Zahlenliste:
        // 4, 8, 7, 10, 2, 9, 11, 5, 8, 0, 5.
        // Gib sie auf der Konsole aus.
        //Entferne alle durch 5 teilbaren Zahlen aus der Liste.
        // Gib die Liste erneut auf der Konsole aus.


        List<Integer> numbers = new ArrayList<>();

        numbers.add(-4);
        numbers.add(8);
        numbers.add(7);
        numbers.add(10);
        numbers.add(2);
        numbers.add(9);
        numbers.add(11);
        numbers.add(5);
        numbers.add(8);
        numbers.add(0);
        numbers.add(5);

        System.out.println(numbers);

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {

            Integer currentFruit = iterator.next();
            if (currentFruit % 5 == 0) {
                iterator.remove();
            }
        }
            System.out.println(numbers);
    }
}
