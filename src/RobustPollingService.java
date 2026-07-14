public class RobustPollingService {
    private volatile boolean running = true;
    private Thread pollingThread;

    public void startPolling() {
        pollingThread = new Thread(() -> {
            try {
                while (running && !Thread.currentThread().isInterrupted()) {
                    pollDevices();
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        });
        pollingThread.start();
    }

    public void stop() {
        running = false;          // signal to exit loop
        pollingThread.interrupt(); // interrupt sleep immediately
    }

    void pollDevices() {
        System.out.println("Checking Printer 1...");
        System.out.println("Checking Printer 2...");
        System.out.println("Checking Printer 3...");
    }

}