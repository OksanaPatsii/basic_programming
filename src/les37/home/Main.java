package les37.home;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // (Optional, für Fortgeschrittene, falls gewünscht):
        //Erstellen Sie eine Schülerklasse.
        //Jeder Schüler sollte einen Namen, ein Alter und eine Liste der von ihm gelesenen Bücher haben (eine String-Liste, die nur Buchtitel enthält).
        //Erstellen Sie in der Hauptmethode eine Schülerliste und füllen Sie sie mit fünf Schülerobjekten, jedes mit einer eigenen Bücherliste.
        //Konvertieren Sie die Schülerliste mithilfe eines Streams in eine Liste der von allen Schülern gelesenen Bücher.

        List<Student> students = List.of(
                new Student("Oleksandr", 19, List.of("Katzentage", "Kreativ in den Herbst!")),
                new Student("Ivan", 18, List.of("Eat Yourself Healthy")),
                new Student("Mihael", 40, List.of("Wachs", "Flusslinien")),
                new Student("Olena", 21, List.of("Easy Air Fryer", "The House of Beckham")),
                new Student("Petr", 34, List.of("Was wir wissen können", "Die geheimnisvolle Bäckerei in der rue de Paris"))
        );

        List<String> allBooks = students
                .stream()
                .map(Student::getBooks)
                .flatMap(List::stream)
                .distinct()
                .toList();

        System.out.println(allBooks);

    }
}
