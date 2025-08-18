package les28.task4;

public enum Planet {

    MERCURY("Merkur", false),
    VENUS("Merkur", false),
    EARTH("Erde", false),
    MARS("Mars", false),
    JUPITER("Jupiter", true),
    SATURN("Saturn", true),
    URANUS("Uranus", true),
    NEPTUNE("Neptun", true);

    private String germanName;
    private boolean isGasGiant;

    Planet(String germanName, boolean isGasGiant) {
        this.germanName = germanName;
        this.isGasGiant = isGasGiant;
    }

    public String getGermanName() {
        return germanName;
    }

    public boolean isGasGiant() {
        return isGasGiant;
    }
}
