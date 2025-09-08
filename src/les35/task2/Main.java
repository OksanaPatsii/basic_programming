package les35.task2;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Braun", 7, 15.94);
        Dog dog2 = new Dog("Rot", 4, 12.83);
        System.out.println("Ursprüngliche Hunde");
        System.out.println(dog1);
        System.out.println(dog2);

        Function<Dog, Cat> converter = x -> {
          String color = x.getColor();
          int age = x.getAge();
          double weight = x.getWeight();

          return new Cat(color, age, weight / 2);
        };
        Cat cat1 = converter.apply(dog1);
        Cat cat2 = converter.apply(dog2);

        System.out.println("Die daraus resultierenden Katzen");
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
