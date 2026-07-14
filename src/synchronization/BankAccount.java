package synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    // the explicit lock we are using here
    Lock lock = new ReentrantLock();

//    public synchronized void withdraw(int amount) {
      public void withdraw(int amount) { //here we have not whole block synchronized likewise
        System.out.println(Thread.currentThread().getName() + " attempting to withdrawl " + amount);

        try {
                // here will chekc if the lock is available or not for to like acquire likewise
            if (lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " processing with the withdraw ");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " compleetd the withdrawl .remaining balance is " + balance);
                    } catch (Exception e) {
                            Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            }
                // this else work when the lock is not available
            else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock will try later");
            }

        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
