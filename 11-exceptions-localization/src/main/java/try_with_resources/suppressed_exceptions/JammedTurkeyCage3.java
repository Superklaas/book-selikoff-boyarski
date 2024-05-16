package try_with_resources.suppressed_exceptions;

/**
 * Suppressed exceptions are only kept when the (primary) exception is thrown in try block.
 * Exceptions thrown in finally block (bad practice!) prevail.
 * In this case, the suppressed exceptions get lost.
 */
public class JammedTurkeyCage3 implements AutoCloseable {

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
        var jammedTurkeyCage = new JammedTurkeyCage3();
        try (jammedTurkeyCage) {
            throw new RuntimeException("Turkeys ran off");
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
            for (Throwable suppressedException : exception.getSuppressed()) {
                System.out.println(suppressedException.getMessage());
            }
        } finally {
            throw new RuntimeException("Turkeys not found");
        }
    }

}
