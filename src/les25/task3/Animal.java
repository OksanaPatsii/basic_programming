package les25.task3;

public abstract class Animal {

    private double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public Animal() {
        System.out.println("Heißt der Konstruktor der Klasse Tiere");
    }

    public abstract void feed();

}