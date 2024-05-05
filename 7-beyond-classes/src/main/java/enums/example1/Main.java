package enums.example1;

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
        System.out.println("------------");

        for (Season season : Season.values()) {
            String seasonalInformation = switch (season) {
                case SUMMER, FALL, WINTER ->
                        String.format("Opening hours in %s: %s with expected visitors %s and average temperature %s°C",
                                season.name().toLowerCase(),
                                season.getHours(),
                                season.getExpectedVisitors(),
                                season.getAverageTemperature());
                default -> "Default";
            };
            System.out.println(seasonalInformation);
        }

    }

}
