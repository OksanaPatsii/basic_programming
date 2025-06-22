package les16.rectangle;

import java.util.Scanner;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 5);

        rectangle1.printInfo();

        double area = rectangle1.calculateArea();
        System.out.println("Fläche: " + area + " cm²");

        double perimeter = rectangle1.calculatePerimeter();
        System.out.println("Umfang: " + perimeter + " cm");




        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Länge des Rechtecks ein (in cm):");
        double length = scanner.nextDouble();

        System.out.println("Geben Sie die Breite des Rechtecks ein (in cm):");
        double width = scanner.nextDouble();

        Rectangle rect = new Rectangle(length, width);

        rect.printInfo();

        double area1 = rect.calculateArea();
        double perimeter2 = rect.calculatePerimeter();

        System.out.println("Fläche: " + area1 + " cm²");
        System.out.println("Umfang: " + perimeter2 + " cm");

        scanner.close();
    }

}
