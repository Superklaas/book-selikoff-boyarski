public class VarargsParameter {

    public static void walk(int... steps) {
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walk(1,2,3);
        walk(new int[]{1,2,3,4});
        walk();
    }

}
