package try_with_resources.suppressed_exceptions;

public class JammedTurkeyCage implements AutoCloseable{

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
        var jammedTurkeyCage = new JammedTurkeyCage();
        try (jammedTurkeyCage) {
            throw new IllegalStateException("Turkeys ran off");
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
            for (Throwable suppressedException : exception.getSuppressed()) {
                System.out.println(suppressedException.getMessage());
            }
        }
    }

}
