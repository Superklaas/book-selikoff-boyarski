package records;

public record SwordFish(String name) {

    public SwordFish(String firstName, String lastName) {
        this(String.format("%s %s", firstName.toLowerCase(), lastName.toLowerCase()));
    }
}


