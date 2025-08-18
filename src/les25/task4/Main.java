package les25.task4;

import les25.task3.Animal;
import les25.task3.Cat;
import les25.task3.Cow;
import les25.task3.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.feed();

        Animal animal = new Cow();
        animal.feed();
        animal = new Cat();
        animal.feed();

        feedAnimal(animal, 3);
    }

    public static void feedAnimal(Animal animal, int feedTimes) {
        for (int i = 0; i < feedTimes; i++) {
            animal.feed();
        }
    }
}
