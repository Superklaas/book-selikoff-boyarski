package switch_case;

public class SwitchExpression {

    public static void main(String[] args) {

        String season1 = getSeason(1);
        System.out.println("Season month 1: " + season1);

        String season6 = getSeason(6);
        System.out.println("Season month 6: " + season6);

        String season14 = getSeason(14);
        System.out.println("Season month 14: " + season14);

    }

    static String getSeason(int monthNumber) {
        return switch (monthNumber) {
            case 1,2,3 -> "Winter";
            case 4,5,6 -> {
                yield "Spring";
            }
            default -> {
                yield "Invalid month number";
            }
            case 7,8,9 -> "Summer";
            case 10,11,12 -> {
                yield "Fall";
            }
        };
    }

}
