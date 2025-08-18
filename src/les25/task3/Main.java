package les25.task3;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();
        Bird bird = new Bird();

        cat.feed();
        cow.feed();
        dog.feed();

        Airplane airplane = new Airplane();
        airplane.takeOff();
        airplane.fly();
        airplane.land();
    }
}
