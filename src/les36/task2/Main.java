package les36.task2;

import les32.task4.Cat;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 12, 8, 14, 11, 9, 4, 17, 5);
        System.out.println("Holen Sie sich die 3 kleinsten Zahlen");

        List<Integer> smallestNumbers = numbers
                .stream()
                .sorted()
                .limit(3)
                .toList();

        System.out.println(smallestNumbers);
        System.out.println();

        System.out.println("Liste ohne die 2 größten Zahlen");
        List<Integer> numbersWithoutBiggest = numbers
                .stream()
                .sorted((x, y) -> y - x)
                .skip(2)
                .toList();

        System.out.println(numbersWithoutBiggest);
        System.out.println();

        System.out.println("Duplikat entfernen");
        List<String> fruits = List.of("Apfel", "Ananas", "Banane", "Apfel","Pfirsich", "Banane");

        List<String> uniqueFruits = fruits
                .stream()
                .distinct()
                .toList();
        System.out.println("Alle Früchte - " + fruits);
        System.out.println("Einzigartige Früchte - " + uniqueFruits);
        System.out.println();
        // Aufgabe: Eine sortierte Liste von Früchten erstellen
        // und dabei den Namen der Frucht mit ihrer Länge anzeigen:
        // Apfel -> Apfel 6, aber so, dass die endgültige sortierte Liste
        // Objekte ohne Angabe der Länge – Apfel – enthält.
        // peek() ist eine Pipeline-Methode, mit der Sie eine Aktion für
        // jedes Objekt in der Sequenz ausführen können. Diese zusätzliche Aktion
        // hat jedoch möglicherweise keine Auswirkungen auf das Objekt selbst, und die Objekte
        // werden unverändert in die endgültige Liste aufgenommen.

        List<String> sortedFruits = fruits
                .stream()
                .sorted()
                .peek(x -> System.out.println(x + " " + x.length()))
                .toList();

        System.out.println("sortierte Früchte");
        sortedFruits.forEach(x -> System.out.println(x));
        System.out.println();

        List<Cat> cats = List.of(
                new Cat("Weiß", 3, 4.56),
                new Cat("Schwarz", 7, 6.32),
                new Cat("grau", 4, 3.72),
                new Cat("Rot", 4, 2.72),
                new Cat("Gelb", 1, 8)
        );

        List<Cat> sortedCats = cats
                .stream()
                .sorted()
                .peek(x -> x.setAge(x.getAge() + 1))
                .toList();

        sortedCats.forEach(x -> System.out.println(x));
    }
}
