package encapsulation;

public class EncapsulatedCrane {

    private int numberEggs;
    private String name;

    public EncapsulatedCrane(int numberEggs, String name) {
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

    public void setNumberEggs(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EncapsulatedCrane other = (EncapsulatedCrane) o;
        if (getNumberEggs() != other.getNumberEggs()) return false;
        return getName() != null ? getName().equals(other.getName()) : other.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getNumberEggs();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EncapsulatedCrane{" +
                "numberEggs=" + numberEggs +
                ", name='" + name + '\'' +
                '}';
    }

}
