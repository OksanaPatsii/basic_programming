package les18.publicAndPrivate.practice.task1;

public class Phone {
    private String brand;
    private String model;
    private double memory;

    public Phone(String brand, String model, double memory) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getMemory() {
        return memory;
    }

    public void receiveMessage(String message, double messageMemorySize) {
        System.out.println("Nachricht erhalten: " + message);
        memory = memory - messageMemorySize;
    }

    public String getDeviceInfo() {
        String info = "Hersteller: " + brand + ", Modell: " + model + ", freie Speichergröße: " + memory;
        return info;
    }

    public void printDeviceInfo() {
        System.out.println("Hersteller: " + brand + ", Modell: " + model + ", freie Speichergröße: " + memory);
    }
}
