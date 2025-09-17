package les37.task1;

import les35.task2.Cat;
import les35.task2.Dog;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // less35.task2
        List<Dog> dogs = List.of(
                new Dog("Braun", 3, 12),
                new Dog("Rot", 5, 15),
                new Dog("Schwarz", 7, 9)
        );

        System.out.println("Ursprüngliche Hunde");
        // dogs.forEach(x -> System.out.println(x));
        dogs.forEach(System.out::println);

        System.out.println();

        List<Cat> cats = dogs
                .stream()
                .map(x -> {
                    String color = x.getColor();
                    int age = x.getAge();
                    double weight = x.getWeight();
                    return new Cat(color, age, weight / 2);
                })
                .toList();

        cats.forEach(System.out::println);
    }

}
