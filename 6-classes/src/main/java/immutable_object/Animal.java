package immutable_object;

import java.util.ArrayList;
import java.util.List;

public final class Animal {

    private final List<String> favoriteFoods;

    /**
     * Constructor with parameter List<String> favoriteFoods.
     * This list will become the value assigned to the instance variable favoriteFoods.
     * To prevent this list from being modified, a defensive copy is made in the constructor.
     * When changes happen to this list outside Animal class, the instance variable favoriteFoods won't reflect these changes.
     */
    public Animal(List<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.isEmpty()) {
            throw new RuntimeException("Favorite food list should exist and should contain at least one item");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods); // defensive copy
    }

    /**
     * Delegate method to obtain size of list.
     */
    private int getNumberOfFavoriteFoods() {
        return favoriteFoods.size();
    }

    /**
     * Delegate method to obtain element from list.
     */
    private String getFavoriteFoodByIndex(int index) {
        return favoriteFoods.get(index);
    }

    public static void main(String[] args) {
        var favoriteFoods = new ArrayList<String>();
        favoriteFoods.add("banana");
        favoriteFoods.add("apple");
        Animal zebra = new Animal(favoriteFoods);
        favoriteFoods.clear();
        favoriteFoods.add("burrito");
        favoriteFoods.add("taco");
        System.out.println(zebra.getFavoriteFoodByIndex(0)); // banana
        System.out.println(zebra.getFavoriteFoodByIndex(1)); // apple
        System.out.println(zebra.getNumberOfFavoriteFoods()); // 2
    }

}
