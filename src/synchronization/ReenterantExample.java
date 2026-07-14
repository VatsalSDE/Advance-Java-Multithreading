package synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterantExample extends Thread{
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();

        try{
            System.out.println("Outer Method");
            innermethod();
        }
        finally {
            lock.unlock();
        }
    }

    public void innermethod(){
        lock.lock();
        try{
            System.out.println("Inner method is calling");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReenterantExample reenterantExample = new ReenterantExample();

//        reenterantExample.
    }
}
