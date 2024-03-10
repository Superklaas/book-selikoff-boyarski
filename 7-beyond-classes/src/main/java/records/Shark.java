package records;

public record Shark(int length, String name) {

    public Shark {
        if(length < 0) throw  new IllegalArgumentException("Length should be positive");
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

}
