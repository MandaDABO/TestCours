package testcours;

public class Gav {

 
    private final String group;
    private final String artifact;
    private final String version;

    public Gav(String coordinate) {
        String[] parts = coordinate.split(":");
        this.group = parts[0];
        this.artifact = parts[1];
        this.version = parts[2];
    }

    public String group() {
        return group;
    }

    public String artifact() {
        return artifact;
    }

    public String version() {
        return version;
    }
}