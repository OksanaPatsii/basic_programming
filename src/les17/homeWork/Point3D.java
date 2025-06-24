package les17.homeWork;

public class Point3D {
    public double x;
    public double y;
    public double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distanceFromOrigin() {
        return Math.sqrt(x * 2 + y * 2 + z * 2);
    }


    public void printInfoPoint3D() {
        System.out.println("Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}'
        );
    }
}
