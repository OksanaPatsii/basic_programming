package les28.task4;

public class Main2 {
    public static void main(String[] args) {
        Planet planet = Planet.NEPTUNE;
        System.out.println("Name Planet auf Deutsch  - " + planet.getGermanName());
        System.out.println("Ist der Planet ein Gasriese? - " + planet.isGasGiant());
    }
}
