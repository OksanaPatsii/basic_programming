package les25.home;

public class Main {
    public static void main(String[] args) {

        Figure[] figure = new Figure[3];

        figure[0] = new Circle(7);
        figure[1] = new Rectangle(8, 12);
        figure[2] = new Square(17);

        for (int i = 0; i < figure.length; i++) {
            System.out.println("Number " + (i + 1) + ":");
            System.out.println("Quadrat: " + figure[i].getArea());
            System.out.println("Perimeter: " + figure[i].getPerimeter());
            System.out.println();
        }
    }
}
