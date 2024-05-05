package review_questions.question22;

class Person {
    static  String name;
    void setName(String q) {
        name = q;
    }
}

public class Child extends Person {
    static String name;
    void setName(String w) {
        name = w;
    }
    public static void main(String[] args) {
        final Child m = new Child();
        final Person t = m;
        m.name = "Elysia";
        t.name = "Sophia";
        m.setName("Webby");
        t.setName("Olivia");
        System.out.println(m.name + " " + t.name);
    }
}
