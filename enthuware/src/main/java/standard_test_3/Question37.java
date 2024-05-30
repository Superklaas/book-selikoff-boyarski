package standard_test_3;

public class Question37 {
}

class TestClass {

    int x = 5;

    int getX() {
        return x;
    }

    public static void main(String args[]) throws Exception {
        TestClass tc = new TestClass();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper() {
        var x = 0;
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
            }
        }
    }

}
