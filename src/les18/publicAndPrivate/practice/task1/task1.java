package les18.publicAndPrivate.practice.task1;

public class task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", "S24+", 256);

        phone1.printDeviceInfo();
        phone1.getDeviceInfo();
        phone1.receiveMessage(phone1.getDeviceInfo(), 40);

        phone1.printDeviceInfo();

        phone1.receiveMessage("Message #1", 9);

        phone1.printDeviceInfo();

    }
}
