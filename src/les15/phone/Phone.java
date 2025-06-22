package les15.phone;

public class Phone {
    String manufacturer;
    String model;
    String color;
    int memory;
    double price;
    String alarmMusic;

    public void ring(String callInfo) {
        System.out.println(callInfo + " rufen Ihnen an");
    }

    public void  alarm() {
        System.out.println(alarmMusic);
        System.out.println("Es ist Zeit aufstehen");
    }

    public void printInfo() {
        System.out.println("Über dieses Gerät: ");
        System.out.println("Hersteller: " + manufacturer);
        System.out.println("Modell: " + model);
        System.out.println("Farbe: " + color);
        System.out.println("Speicher: " + memory);
        System.out.println("Preis: " + price);
    }
}
