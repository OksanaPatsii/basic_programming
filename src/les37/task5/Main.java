package les37.task5;

import les35.task2.Cat;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cat> cats = List.of(
                new Cat("Rot", 3, 4),
                new Cat("Rot", 3, 4.56),
                new Cat("Braun", 7, 6),
                new Cat("Rot", 4, 4),
                new Cat("Grau", 9, 5),
                new Cat("Schwarz", 1, 5)
        );

        boolean result = cats
                .stream()
                .anyMatch(x -> x.getColor().equals("Schwarz"));

        if (result) {
            System.out.println("Auf der Liste steht auf jeden Fall mindestens eine schwarze Katze.");
        } else {
            System.out.println("Auf der Liste steht keine einzige schwarze Katze");
        }

        List<Cat> cats1 = List.of(
                new Cat("Schwarz", 3, 4),
                new Cat("Schwarz", 3, 4.56),
                new Cat("Schwarz", 7, 6),
                new Cat("Schwarz", 4, 4),
                new Cat("Schwarz", 9, 5),
                //       new Cat("Grau", 9, 5),
                new Cat("Schwarz", 1, 5)
        );

        result = cats1
                .stream()
                .allMatch(x -> x.getColor()
                        .equals("Schwarz"));

        if (result) {
            System.out.println("Alle Katzen auf der Liste sind schwarz.");
        } else {
            System.out.println("Auf der Liste befindet sich mindestens eine nicht schwarze Katze.");
        }

        List<Cat> cats2 = List.of(
                new Cat("Rot", 3, 4),
                new Cat("Rot", 3, 4.56),
                new Cat("Schwarz", 1, 5),
                new Cat("Braun", 7, 6),
                new Cat("Rot", 4, 4),
                new Cat("Grau", 9, 5),
                new Cat("Rot", 4, 4),
                new Cat("Schwarz", 1, 5)
        );

        long redAndBlackCatsCount = cats2
                .stream()
                .filter(x -> x.getColor().equals("Schwarz") || x.getColor().equals("Rot"))
                .count();
        System.out.println("die Anzahl der roten und schwarzen Katzen - " + redAndBlackCatsCount);
    }
}
