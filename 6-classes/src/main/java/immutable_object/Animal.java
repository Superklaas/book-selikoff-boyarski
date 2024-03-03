package immutable_object;

import java.util.ArrayList;
import java.util.List;

public final class Animal {

    private final List<String> favoriteFoods;

    public Animal(List<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.isEmpty()) {
            throw new RuntimeException("Favorite food list should exist and should contain at least one item");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods); // defensive copy
    }

    private int getNumberOfFavoriteFoods() {
        return favoriteFoods.size();
    }

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
