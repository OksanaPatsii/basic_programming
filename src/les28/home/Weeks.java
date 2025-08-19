package les28.home;

public enum Weeks {
    MONDAY("Montag", false),
    TUESDAY("Dienstag", false),
    WEDNESDAY("Mittwoch ", false),
    THURSDAY("Donnerstag", false),
    FRIDAY("Freitag", false),
    SATURDAY("Samstag ", true),
    SUNDAY("Sonntag", true);

    private String germanName;
    private boolean isWeekend;

    Weeks(String germanName, boolean isWeekend) {
        this.germanName = germanName;
        this.isWeekend = isWeekend;
    }

    public String getGermanName() {
        return germanName;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}
