package les16.classConstructor;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.producer = "Mercedes - Benz";
        car1.model = "GLC 250";
        car1.color = "Schwarz";
        car1.maxSpeed = 280;
        car1.printCarInfo();



        Car bmw = new Car();
        bmw.createNew("BMW", "X1", "Blau", 280);
        bmw.printCarInfo();

    }
}
