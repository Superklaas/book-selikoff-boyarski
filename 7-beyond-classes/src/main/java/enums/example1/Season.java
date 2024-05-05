package enums.example1;

public enum Season implements Weather {

    WINTER("low") {
        @Override
        public String getHours() {
            return "10-15";
        }
    },
    SPRING("medium") {
        @Override
        public String getHours() {
            return "9-17";
        }
    },
    SUMMER("high") {
        @Override
        public String getHours() {
            return "9-19";
        }
    },
    FALL("medium"){
        @Override
        public String getHours() {
            return "9-17";
        }
    };

    // static variable
    private static final Season DEFAULT = WINTER;

    // instance variable
    private final String expectedVisitors;

    // constructor: always private
    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    // instance method
    public String getExpectedVisitors() {
        return expectedVisitors;
    }

    // abstract method: implemented per enum value
    public abstract String getHours();

    // implementation of abstract method in interface Weather
    public int getAverageTemperature() {
        return 30;
    }

}

