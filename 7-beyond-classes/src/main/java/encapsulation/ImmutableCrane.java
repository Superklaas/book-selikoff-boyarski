package encapsulation;

public final class ImmutableCrane {

    private final int numberEggs;
    private final String name;

    public ImmutableCrane(int numberEggs, String name) {
        this.name = name;
        if(numberEggs >= 0) {
            this.numberEggs = numberEggs;
        } else {
            throw new IllegalArgumentException(String.format("number of eggs of %s should be a positive number", this.name));
        }
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImmutableCrane{" +
                "numberEggs=" + numberEggs +
                ", name='" + name + '\'' +
                '}';
    }

}
