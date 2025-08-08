package les20.loopStatment.practice;

import les17.Library.UserInput;

public class CarDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int carNumbers = userInput.getUserInteger("Geben Sie die Anzahl der Autos im Katalog ein");

        for (int i = 0; i < carNumbers; i++) {
            String carProducer = userInput.getUserText("Geben Sie die Automarke ein: ");
            String carModel = userInput.getUserText("Geben Sie die Model ein: ");
            int carPower = userInput.getUserInteger("Geben Sie die Kraft des Autos ein: ");

            Car car = new Car(carProducer, carModel, carPower);
            car.printCarInfo();


        }
    }
}
