package generics;

public class TrickyGenericMethod {
    public static void main(String[] args) {
        Tricky<Integer> trickyObject = new Tricky<>();
        trickyObject.trickyMethod("tricky");
    }
}

class Tricky<T> {
    <T> void trickyMethod(T t) {
        System.out.println(t);
    }
}


