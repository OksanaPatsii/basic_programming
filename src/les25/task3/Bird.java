package les25.task3;

public class Bird extends Animal implements Flyable {

    public Bird(double weight) {
        super(weight);
    }

    public Bird() {
        System.out.println("der Konstruktor der Vogelklasse heißt");
    }

    @Override
    public void feed() {
        System.out.println("Der Vogel ernährt sich von Insekten");
    }

    @Override
    public void takeOff() {
        System.out.println("Der Vogel hebt ab.");
    }

    @Override
    public void fly() {
        System.out.println("Der Vogel fliegt.");
    }

    @Override
    public void land() {
        System.out.println("Der Vogel landet.");
    }
}
