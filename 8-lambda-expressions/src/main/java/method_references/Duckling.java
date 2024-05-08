package method_references;

public class Duckling {

    interface LearnToSpeak {
        void speak(String sound);
    }

    public void makeSound_anonymousClass(String sound) {
        LearnToSpeak learnToSpeak = new LearnToSpeak() {
            @Override
            public void speak(String sound) {
                System.out.println(sound);
            }
        };
        learnToSpeak.speak(sound);
    }

    public void makeSound_lambdaExpression(String soundParam) {
        LearnToSpeak learnToSpeak = sound -> System.out.println(sound);
        learnToSpeak.speak(soundParam);
    }

    public void makeSound_methodReference(String soundParam) {
        LearnToSpeak learnToSpeak = System.out::println;
        learnToSpeak.speak(soundParam);
    }

    public static void main(String[] args) {
        Duckling duckling = new Duckling();
        duckling.makeSound_anonymousClass("AC");
        duckling.makeSound_lambdaExpression("LE");
        duckling.makeSound_methodReference("MR");
    }

}
