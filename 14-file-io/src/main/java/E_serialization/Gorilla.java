package E_serialization;

import java.io.Serial;
import java.io.Serializable;

public class Gorilla implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String name;
    private final int age;
    private final boolean friendly;
    private transient String favoriteFood;

    public Gorilla(String name, int age, boolean friendly) {
        this.name = name;
        this.age = age;
        this.friendly = friendly;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFriendly() {
        return friendly;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    @Override
    public String toString() {
        return "Gorilla{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendly=" + friendly +
                '}';
    }
}
