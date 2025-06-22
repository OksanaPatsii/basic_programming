package les16.classConstructor;

public class Car {
    String producer;
    String model;
    String color;
    int maxSpeed;

    public void createNew(String pr, String m, String c, int max) {
        producer = pr;
        model = m;
        color = c;
        maxSpeed = max;
    }

    public void printCarInfo() {
        System.out.println("Hersteller: " + producer + ", Model: " + model + ", Farbe: " + color + ", Höchstgeschwindigkeit: " + maxSpeed);
    }



}
