public class TextBlocks {
    public static void main(String[] args) {

        String name = """
                klaas
                 klaas""";
        System.out.println(name);
        System.out.println("-----------------");

        String pyramid = """
                  *
                 ***
                *****""";
        System.out.println(pyramid);
        System.out.println("-----------------");

        String fourLines = """
                doe \n
                deer
                """;
        System.out.println(fourLines);
        System.out.println("-----------------");

        String block = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.print("*" + block + "*");

    }
}
