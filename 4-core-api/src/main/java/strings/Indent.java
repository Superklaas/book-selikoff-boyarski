package strings;

public class Indent {

    public static void main(String[] args) {

        var block = """
                a
                 b
                c""";

        // line termination normalization: indent() adds line break at end of last line
        System.out.println(block.length()); //6
        System.out.println(block.indent(1).length()); //10 = 3 new whitespaces added + line break added at last line

        var concat = " a\n"
                + "  b\n"
                + " c";

        // remove all leading spaces that can be found when n > number of leading whitespaces
        System.out.println(concat.length()); //9
        System.out.println(concat.indent(-4).length()); //6 = 4 whitespaces taken away & line break added at last line

    }

}
