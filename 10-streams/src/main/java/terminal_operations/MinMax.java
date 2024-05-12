package terminal_operations;

import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {

        List<String> marineMammals = List.of("dolphin", "orca", "whale");

        String shortestMammal = marineMammals.stream()
                .min(Comparator.comparingInt(String::length))
                .orElseThrow();
        System.out.printf("Shortest mammal: %s%n", shortestMammal);

        String longestMammal = marineMammals.stream()
                .max((a,b) -> a.length() - b.length())
                .orElseThrow();
        System.out.printf("Longest mammal: %s%n", longestMammal);

    }
    
}
