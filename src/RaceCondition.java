public class RaceCondition {
    int count = 0;

    void increment() {
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
        RaceCondition counter = new RaceCondition();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();   // wait for t1 to finish
        t2.join();   // wait for t2 to finish

        System.out.println("Count: " + counter.count);
    }
}
