package les30.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Peach");
        fruits.add("Melon");
        fruits.add("Cherry");
        fruits.add("Apricot");
        fruits.add("Pineapple");

        System.out.println(fruits);

//        for (int i = 0; i < fruits.size(); i++) {
//            String fruit = fruits.get(i);
//            if (fruit.startsWith("P")) {
//                fruits.remove(i);
//            }
//        }
        System.out.println(fruits);

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String currentElement = iterator.next();

            if (currentElement.startsWith("P")) {
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}
