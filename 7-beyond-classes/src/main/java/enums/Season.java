package enums;

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

    private final String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public String getExpectedVisitors() {
        return expectedVisitors;
    }

    public abstract String getHours();

    public int getAverageTemperature() {
        return 30;
    }

}

