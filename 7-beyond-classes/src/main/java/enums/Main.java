package enums;

class Main {

    public static void main(String[] args) {

        var s = Season.SUMMER;
        System.out.println(Season.SUMMER == s);
        System.out.println(Season.SUMMER.equals(s));
        for (Season season : Season.values()) {
            System.out.printf("%s %d%n", season.name(), season.ordinal());
        }
        System.out.println(Season.valueOf("SUMMER"));
        System.out.println(Season.WINTER.getExpectedVisitors());
        System.out.println(Season.FALL.getHours());
        System.out.println(Season.SPRING.getAverageTemperature());
        System.out.println("-------------------");

        System.out.println("begin");
        var once = OnlyOne.ONCE;
        var twice = OnlyOne.ONCE;
        System.out.println("end");

    }

}
