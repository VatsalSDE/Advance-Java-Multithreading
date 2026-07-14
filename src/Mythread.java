public class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");

        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Mythread t1 = new Mythread();
        t1.start();
        System.out.println(t1.getState());

        Thread.sleep(1000); // here this we are sleeping the main thread okk so yeah like wise

        System.out.println(Thread.currentThread().getState());

        System.out.println(t1.getState());

        t1.join();  // here the caller is the main method of this thread so like the main method will wait for the t1 thread to complete likewise
        // SO NOW THE STATE OF THE T1 THREAD WILL BE TERMINATED
        System.out.println(t1.getState());
    }
}
