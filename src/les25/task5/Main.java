package les25.task5;

import les25.task3.*;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Fish(), new Cat(), new Cow(), new Cat(), new Dog(), new Bird()};

        for (int i = 0; i < animals.length; i++) {
            animals[i].feed();
        }

        System.out.println("--------------");
        for (Animal animal : animals) {
            animal.feed();
        }
    }
}
