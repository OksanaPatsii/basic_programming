package les28.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Planet planet = Planet.MARS;
        System.out.println(planet);

        Planet[] solarSystem = Planet.values();

        System.out.println(Arrays.toString(solarSystem));

        Planet[] gasGiants = {Planet.JUPITER, Planet.JUPITER, Planet.URANUS, Planet.NEPTUNE};
        System.out.println();
        System.out.println(Arrays.toString(gasGiants));
    }
}
