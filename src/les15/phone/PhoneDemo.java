package les15.phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();

        phone1.manufacturer = "Apple";
        phone1.model = "iPhone 14 Pro MAX";
        phone1.color = "Schwarz";
        phone1.memory = 512;
        phone1.price = 1499;
        phone1.alarmMusic = "Beep - Beep - Beep!!!";

        phone1.ring("Emily");
        phone1.alarm();

        phone1.printInfo();
    }
}
