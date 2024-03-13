package nested_classes.inner_classes.example2;

public class A {

    private final int x = 1;

    class B {

        private final int x = 2;

        class C {

            void printX() {
                int x = 3;
                System.out.println(x);
                System.out.println(x);
                System.out.println(B.this.x);
                System.out.println(A.this.x);
            }

        }

    }

}
