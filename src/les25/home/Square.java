package les25.home;

public class Square extends Figure{
    private double lengthSide;

    public Square(double lengthSide) {
        this.lengthSide = lengthSide;
    }

    public double getLengthSide() {
        return lengthSide;
    }

    @Override
    public String toString() {
        return "Square{" +
                "lengthSide=" + lengthSide +
                '}';
    }

    @Override
    public double getArea() {
        System.out.println("Figur Quadrat: ");
        return lengthSide * lengthSide;
    }

    @Override
    public double getPerimeter() {
        return 4 *lengthSide;
    }
}
