package switch_case;

public class SwitchStatement {

    public static void main(String[] args) {
        String season = getSeason(1);
        System.out.println(season);
    }

    static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 1, 2, 3:
                return "Winter";
            case 4, 5, 6:
                return "Spring";
            default:
                return "Invalid month number";
            case 7, 8, 9:
                return "Summer";
            case 10, 11, 12:
                return "Fall";
        }
    }

}
