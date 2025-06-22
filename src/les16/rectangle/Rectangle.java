package les16.rectangle;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void printInfo() {
        System.out.println("Das Rechteck hat eine Länge von " + length + " cm " + " und eine Breite von " + width + " cm.");
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
