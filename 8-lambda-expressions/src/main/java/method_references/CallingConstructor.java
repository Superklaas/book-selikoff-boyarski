package method_references;

public class CallingConstructor {

    interface StringCreator {
        String create();
    }

    String createEmptyString() {
//        StringCreator stringCreator = new StringCreator() {
//            @Override
//            public String create() {
//                return new String();
//            }
//        };
//        StringCreator stringCreator = () -> new String();
        StringCreator stringCreator = String::new;
        return stringCreator.create();
    }

    String createKlaasString() {
        StringCreator stringCreator = () -> "klaas";
        return stringCreator.create();
    }

    public static void main(String[] args) {
        System.out.println(new CallingConstructor().createEmptyString());
        System.out.println(new CallingConstructor().createKlaasString());
    }

}
