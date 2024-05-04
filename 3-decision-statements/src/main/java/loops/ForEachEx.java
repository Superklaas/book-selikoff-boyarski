package loops;

public class ForEachEx {

    public static void main(String[] args) {

        String name = "KLAAS";
        for (char letter : name.toCharArray()) {
            System.out.print(letter + "-");
        }

    }

}
