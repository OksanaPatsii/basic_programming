package les17.homeWork;

import java.util.Scanner;

public class HomeWorkDemo {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(5, 3, 2.5);

        point3D.distanceFromOrigin();
        double distance = point3D.distanceFromOrigin();
        point3D.printInfoPoint3D();
        System.out.println("Entfernung zum Ursprung: " + distance);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Titel des Buches ein");
        String titleBook = scanner.nextLine();

        System.out.println("Geben Sie den Autor des Buches ein");
        String authorBook = scanner.nextLine();

        System.out.println("Geben Sie die Anzahl der Seiten ein");
        int pagesBook = scanner.nextInt();

        Book book1 = new Book(titleBook, authorBook, pagesBook);
        book1.printDescription();



        System.out.println("Geben Sie den Radius des Kreises an");
        double radius = scanner.nextDouble();

        Circle circle1 = new Circle(radius);

        circle1.printInfoCircle();
        System.out.println("Fläche des Kreises: " + circle1.getArea());
        System.out.println("Durchmesser des Kreises: " + circle1.getDiameter());

        scanner.close();

        RGBColor color1 = new RGBColor(100, 150, 200);
        RGBColor color2 = new RGBColor(50, 100, 250);

        System.out.println("Farbe 1: ");
        color1.printColor();

        System.out.println("Farbe 2: ");
        color2.printColor();

        RGBColor mixedColor = color1.blend(color2);

        System.out.print("Gemischte Farbe: ");
        mixedColor.printColor();
    }
}
