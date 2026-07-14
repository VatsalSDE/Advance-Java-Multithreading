public class yieldmethod extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is Running");
        }
    }

    public static void main(String[] args) {
        yieldmethod t1 = new yieldmethod();
        yieldmethod t2 = new yieldmethod();

        t1.start();
        t2.start();
    }
}
