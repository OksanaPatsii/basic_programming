package les15;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.catalogNumber = 1;
        car1.model = "Mercedes GLC 250";
        car1.color = "Schwarz";
        car1.isAutomat = true;
        car1.numberDoors = 4;
        car1.sizeOfWheels = 21;
        car1.isDiesel = true;

        System.out.println("Unser Auto");
        System.out.println(car1.catalogNumber + " " + car1.model + " " + car1.color + " " + car1.isAutomat + " " + car1.numberDoors);

    }


}
