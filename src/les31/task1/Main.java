package les31.task1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> fruits = new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apricot");
        fruits.add("Cherry");
        fruits.add("Pear");
        fruits.add("Lemon");
        fruits.add("Banana");

        System.out.println(fruits);

        boolean result = fruits.add("Pear");

        if (result) {
            System.out.println("Obst wurde hinzugefügt");
        } else {
            System.out.println("Obst wurde nicht hinzugefügt");
        }

        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println("Ist im Set eine Banane enthalten? - " + fruits.contains("Banana"));

        List<String> fruitsList = List.of("Orange", "Cherry", "Lemon");
        System.out.println(fruits);
        System.out.println(fruitsList);

        System.out.println("Enthält der Satz alle Elemente des Blattes? - " + fruits.containsAll(fruitsList));

        fruits.removeAll(fruitsList);
        System.out.println(fruits);
        System.out.println(fruitsList);

        fruits.remove("Banana");
        System.out.println(fruits);

       // fruits.clear();
       // System.out.println(fruits);
    }
}
