package les34.task1;

public enum Degree {

    BACHELOR("Bachelor"),
    MASTER("Master");

    private final String germanTranscription;

    Degree(String germanTranscription) {
        this.germanTranscription = germanTranscription;
    }

    public String getGermanTranscription() {
        return germanTranscription;
    }
}
