package review_questions.question26;

public enum Animal {

    DUCK(false), DONKEY(true), FISH(false) {
        public int swim() {
            return 4;
        }
    };

    public int swim() {
        return 0;
    }

    private boolean hasHair;

    Animal(boolean hasHair) {
        this.hasHair = hasHair;
    }

}
