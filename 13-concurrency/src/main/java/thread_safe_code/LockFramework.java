package thread_safe_code;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockFramework {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();

        new Thread(() -> printHelloLock(lock)).start();
        new Thread(() -> printHelloLock(lock)).start();
        new Thread(() -> printHelloLock(lock)).start();
        new Thread(() -> printHelloLock(lock)).start();

        new Thread(() -> printHelloTryLock(lock)).start();
        new Thread(() -> printHelloTryLock(lock)).start();
        new Thread(() -> printHelloTryLock(lock)).start();
        new Thread(() -> printHelloTryLock(lock)).start();

        new Thread(() -> {
            try {
                printHelloTryLockWithTimer(lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

    }

    /**
     * void lock()
     * request lock, thread blocked until lock is acquired
     * no check or timeout: thread could be blocked forever
     */
    public static void printHelloLock(Lock lock) {
        try {
            lock.lock();
            System.out.println("using method lock()");
        } finally {
            lock.unlock();
        }
    }

    /**
     * boolean tryLock()
     * request lock without blocking thread
     * checks with boolean return value is lock has been acquired or not
     */
    public static void printHelloTryLock(Lock lock) {
        if (lock.tryLock()) {
            try {
                Thread.sleep(1);
                System.out.println("using method tryLock()");
            } catch (InterruptedException e) {
                System.out.println("thread interrupted");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock with method tryLock()");
        }
    }

    /**
     * boolean tryLock(long time, TimeUnit unit)
     * request lock & blocks thread for given amount of time or until lock is acquired
     * checks with boolean return value if lock has been acquired or not
     */
    public static void printHelloTryLockWithTimer(Lock lock) throws InterruptedException {
        if (lock.tryLock(20, TimeUnit.MILLISECONDS)) {
            try {
                System.out.println("using method tryLock() with timeout");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock with method tryLock() with timeout");
        }
    }

}
