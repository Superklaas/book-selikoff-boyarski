package try_with_resources;

public class ResourceEffectivelyFinal {

    public static void main(String[] args) {

        MyResource resource1 = new MyResource(1);
        MyResource resource2 = new MyResource(2);

        try (resource1; MyResource resource3 = new MyResource(3); resource2) {
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }

    }

}
