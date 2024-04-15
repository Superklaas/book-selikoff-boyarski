package thread_safe_code;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockFramework {

    public static void printHelloLock(Lock lock) {
        try {
            lock.lock();
            System.out.println("using method lock()");
        } finally {
            lock.unlock();
        }
    }

    public static void printHelloTryLock(Lock lock) {
        if (lock.tryLock()) {
            try {
                System.out.println("using method tryLock()");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock with tryLock()");
        }
    }

    public static void printHelloTryLockWithTimer(Lock lock) throws InterruptedException {
        if (lock.tryLock(20, TimeUnit.NANOSECONDS)) {
            try {
                System.out.println("using method tryLock() with timeout 20 ns");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock with tryLock()");
        }
    }

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

}
