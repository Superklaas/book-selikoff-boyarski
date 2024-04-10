package threads;

public class DaemonThread {

    public static void main(String[] args) {
        Runnable task = DaemonThread::pause;
        Thread thread = new Thread(task);
        System.out.println(thread.getState());
        thread.setDaemon(true);
        thread.start();
        System.out.println(thread.getState());
        System.out.println("main method finished");
        System.out.println(thread.getState());
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
