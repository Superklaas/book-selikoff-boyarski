package try_with_resources.suppressed_exceptions;

public class TurkeyCage implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Close gate");
    }

    public static void main(String[] args) {
        try (var turkeyGate = new TurkeyCage()) {
            System.out.println("Put turkeys in");
        }
    }

}
