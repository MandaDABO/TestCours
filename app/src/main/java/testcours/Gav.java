package testcours;

public class Gav {

    private final String group;
    private final String artifact;
    private final String version;

    public Gav(String coordinate) {
        String[] parts = coordinate.split(":", -1);

        if (parts.length != 3) {
            throw new IllegalArgumentException("Coordonnée mal formée");
        }

        if (parts[0].isEmpty() || parts[1].isEmpty() || parts[2].isEmpty()) {
            throw new IllegalArgumentException("Coordonnée mal formée");
        }

        this.group = parts[0];
        this.artifact = parts[1];
        this.version = parts[2];
    }

    public static Gav parse(String coordinate) {
        return new Gav(coordinate);
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