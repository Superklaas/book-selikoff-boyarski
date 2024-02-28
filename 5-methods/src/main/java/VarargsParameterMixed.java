public class VarargsParameterMixed {

    public static void walk(int start, int... steps) {
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walk(1);
        walk(1,2,3);
        walk(1, new int[]{1,2,3,4});
        walk(1, null);
    }

}
