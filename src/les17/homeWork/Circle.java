package les17.homeWork;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printInfoCircle() {
        System.out.println("Radius des Kreises: " + radius);
    }


}
