public class PollingThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Poll #" + i);
            try {
                Thread.sleep(2000);   // wait 2 seconds before next poll
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted!");
            }
        }
    }
}