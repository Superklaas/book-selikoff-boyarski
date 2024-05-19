package threads;

public class DaemonThread {

    public static void main(String[] args) {
        Runnable task = () -> pause();
        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();
        System.out.println("main method finished");
    }

    static void pause() {
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("pause method finished");
    }

}
