package les18.publicAndPrivate;

public class Coordinate {
    int xCoordinate;
    int yCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getDistance() {
        double distance = Math.sqrt(xCoordinate * xCoordinate + yCoordinate * yCoordinate);

    return distance;
    }

    public void printResult() {
        System.out.println("Entfernung zum Punkt mit Koordinaten: ");
        System.out.println("X: " + xCoordinate + ", Y: " + yCoordinate);
        System.out.println("wird gleich sein: " + getDistance());
    }

}

