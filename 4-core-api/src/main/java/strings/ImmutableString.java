package strings;

public class ImmutableString {

    public static void main(String[] args) {

        // solution with string: create 27 string objects
        String result = "";
        for (char stringToAdd = 97; stringToAdd <= 122; stringToAdd++) {
            result += stringToAdd;
        }
        System.out.println(result);

        // solution with StringBuilder: create one object and modify this object
        StringBuilder stringBuilder = new StringBuilder();
        for (char stringToAdd = 97; stringToAdd <= 122; stringToAdd++) {
            stringBuilder.append(stringToAdd);
        }
        System.out.println(stringBuilder.toString());

        // two StringBuilder variables pointing to same object
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println(a.toString());
        System.out.println(b.toString());

    }

}
