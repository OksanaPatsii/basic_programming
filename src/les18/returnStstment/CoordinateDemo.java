package les18.returnStstment;

public class CoordinateDemo {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(3, 4);
        coordinate.printResult();


        double calculatedDistance = coordinate.getDistance();
        coordinate.printResultDist(calculatedDistance);

    }


}
