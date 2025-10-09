package les41.task5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("fruits.txt"))) {
            reader.lines().sorted().forEach(System.out::println);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
