package les25.home;

public class Rectangle extends Figure{
    private double lengthOfTheFirstSide;
    private double lengthOfTheSecondSide;

    public Rectangle(double lengthOfTheFirstSide, double lengthOfTheSecondSide) {
        this.lengthOfTheFirstSide = lengthOfTheFirstSide;
        this.lengthOfTheSecondSide = lengthOfTheSecondSide;
    }

    public double getLengthOfTheFirstSide() {
        return lengthOfTheFirstSide;
    }

    public double getLengthOfTheSecondSide() {
        return lengthOfTheSecondSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lengthOfTheFirstSide=" + lengthOfTheFirstSide +
                ", lengthOfTheSecondSide=" + lengthOfTheSecondSide +
                '}';
    }

    @Override
    public double getArea() {
        System.out.println("Rechteckfigur");
        return lengthOfTheFirstSide * lengthOfTheSecondSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * (lengthOfTheFirstSide + lengthOfTheSecondSide);
    }
}
