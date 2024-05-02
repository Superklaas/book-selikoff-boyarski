package strings;

public class MethodChaining {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("d")
                .insert(0,123)
                .delete(4,6)
                .replace(1,2,"klaas");
        System.out.println(stringBuilder);

    }

}
