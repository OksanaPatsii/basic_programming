package les16.temperature;

public class TemperatureControl {
    double celsius;

    public TemperatureControl(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    public void printInfo() {
        System.out.println("Temperature ");
        System.out.println("in Celsius " + celsius + " C");
        System.out.println("in Fahrenheit " + toFahrenheit() + " F");
        System.out.println("in Kelvin " + toKelvin() + " K");

    }

}
