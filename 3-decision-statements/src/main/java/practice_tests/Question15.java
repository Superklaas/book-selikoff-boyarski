package practice_tests;

public class Question15 {

    public static void main(String[] args) {
        int count = 0;
        char letter = 'A';
        switch (letter) {
            case 'A' -> count++;
            case 'B' -> count++;
        }
        System.out.println(count);
    }

}
