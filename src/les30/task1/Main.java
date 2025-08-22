package les30.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Parrot");
        animals.add("Cow");
        animals.add("Tiger");

        System.out.println(animals);

        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println();


        for (int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i) + " ");
        }
        System.out.println();

        int index = 0;
        while (index < animals.size()) {
            System.out.print(animals.get(index++) + " ");
        }
    }
}
