package try_with_resources;

public record MyResource (int num) implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.printf("Closing %s%n", num);
    }

}
