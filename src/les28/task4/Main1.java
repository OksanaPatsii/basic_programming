package les28.task4;

public class Main1 {
    public static void main(String[] args) {

        Planet planet = Planet.EARTH;
        System.out.println("Nummer _ " + planet.ordinal());

        planet = Planet.SATURN;
        System.out.println("Nummer - " + planet.ordinal());

        System.out.println("Nummer " + planet + " " + getOrdinalNumberFromSun("EARTH"));
        System.out.println("Nummer " + planet + " " + getOrdinalNumberFromSun("SATURN"));

    }

    public static int getOrdinalNumberFromSun(String planetName) {
        Planet planet = Planet.valueOf(planetName.toUpperCase());
        return planet.ordinal() + 1;
    }
}
