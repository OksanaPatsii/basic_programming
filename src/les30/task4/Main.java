package les30.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apricot");
        fruits.add("Cherry");
        fruits.add("Pear");
        fruits.add("Lemon");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println(fruits);

        ListIterator<String> iterator = fruits.listIterator();

        while (iterator.hasNext()) {

            String currentFruit = iterator.next();
            if (currentFruit.startsWith("B")) {
                iterator.add("Pineapple");

                while (iterator.hasPrevious()) {
                    currentFruit = iterator.previous();
                    if (currentFruit.startsWith("A")) {
                        iterator.remove();
                    }
                }
                break;
            }
        }
        System.out.println(fruits);
    }
}
