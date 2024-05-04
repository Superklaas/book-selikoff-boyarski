package practice_tests;

public class Question28 {

    public static void main(String[] args) {
        int count = 0;
        var stops = new String[]{"Washington", "Monroe", "Jackson", "LaSalle"};
        while (count < stops.length)
            if (stops[++count].length() < 8)
                break;
            else continue;
        System.out.println(count);
    }
}
