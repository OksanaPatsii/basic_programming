package les36.task1;

import les32.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // List<Integer> numbers = List.of(6, 17, 4, 12, 15, 7, 2, 14, 8);
       // List<Integer> numbers = Arrays.asList(6, 17, 4, 12, 15, 7, 2, 14, 8);

        List<Integer> numbers = new ArrayList<>(List.of(6, 17, 4, 12, 15, 7, 2, 14, 8));
        System.out.println("List - " + numbers);
        System.out.println();

        System.out.println("Numbers > 10");
        List<Integer> filteredNumbers = numbers
                .stream()
                .filter(x -> x > 10)
                .toList();
        System.out.println(filteredNumbers);
        System.out.println();

        System.out.println("Sortierte Zahlen");
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);
        System.out.println();

        System.out.println("Sortierte Zahlen kleiner als 10");
        List<Integer> sortedFilteredNumbers = numbers
                .stream()
                .filter(x -> x < 10)
                .sorted()
                .toList();
        System.out.println(sortedFilteredNumbers);
        System.out.println();

        System.out.println("Katzen nach Alter sortiert");
        List<Cat> cats = List.of(
                new Cat("Weiß", 3, 4.56),
                new Cat("Schwarz", 7, 6.32),
                new Cat("grau", 4, 3.72),
                new Cat("Rot", 4, 2.72),
                new Cat("Gelb", 1, 8)
        );

        // Sehen wir uns an, wie die Sortiermethode nicht mit Zahlen,
        // sondern mit komplexeren Objekten wie "Cat" funktioniert
        // les32_task4

        List<Cat> sortedCats = cats
                .stream()
                .sorted()
                .toList();

        System.out.println("Katzen nach Alter sortiert");
        sortedCats.forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("Alphabetisch nach Farben sortieren");
        List<Cat> catsSortedByColor = cats
                .stream()
                .sorted((x, y )-> x.getColor().compareTo(y.getColor()))
                .toList();

        catsSortedByColor.forEach(x -> System.out.println(x));
    }
}
