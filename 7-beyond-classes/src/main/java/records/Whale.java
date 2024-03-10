package records;

public record Whale(int length, String name) {

    public Whale(int length, String name) {
        if (length < 0) {
            throw new IllegalArgumentException("Length should be positive");
        }
        this.length = length;
        this.name = name;
    }

}
