package AdvanceMultithreading;

public class ThreadInfinity {

    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 10; i++) {

            int id = i;

            Thread t = new Thread(() -> {

                System.out.println(
                        "Java Thread " + id +
                                " OS is running: " +
                                Thread.currentThread().getName()
                );

                while (true) {
                    // Keep thread alive
                }

            });

            t.start();
        }

        while (true) {
            Thread.sleep(1000);
        }
    }
}
