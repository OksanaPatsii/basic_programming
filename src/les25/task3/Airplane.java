package les25.task3;

public class Airplane implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("das Flugzeug hebt ab...");
    }

    @Override
    public void fly() {
        System.out.println("Das Flugzeug fliegt...");
    }

    @Override
    public void land() {
        System.out.println("Das Flugzeug landet...");
    }
}
