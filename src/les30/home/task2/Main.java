package les30.home.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        //Aufgabe 2 (fortgeschrittene Aufgabe, optional, nur für Interessierte):
        //Erstelle eine Zahlenliste – 4, 8, 7, 10, 2, 9, 11, 5, 8, 0, 5.
        // Gib sie auf der Konsole aus.
        //Bewege dich durch die Liste und suche eine Zahl größer als 10.
        //Lösche alle geraden Zahlen vor dieser Zahl aus der Liste.
        // Gib die Liste erneut auf der Konsole aus.
        //Das Programm sollte nichts aus der Liste löschen,
        // wenn keine Zahl größer als 10 gefunden wird.

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
            Integer currentNum = iterator.next();

            if (currentNum > 10) {

                while (iterator.hasPrevious()) {
                    currentNum = iterator.previous();
                    if (currentNum % 2 == 0) {
                        iterator.remove();
                    }
                }
                break;
            }
        }
                System.out.println(numbers);
    }
}
