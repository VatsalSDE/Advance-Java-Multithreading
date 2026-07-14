public class interruptmeth extends Thread{
    @Override
    public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("Thread is running");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
    }

    public static void main(String[] args) {
        interruptmeth t1 = new interruptmeth();

        t1.start();
        t1.interrupt(); // so this methods interrupt the current state if the method like it is sleeping or else waiting else
    }
}
