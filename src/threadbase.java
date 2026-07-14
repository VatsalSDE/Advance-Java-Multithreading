public class threadbase{
    public static void main(String[] args) {

        // thread with the thread class
//        worldthread wt = new worldthread();
//
//        wt.start(); // here starting the thread
//
//        for (int i=0 ; i<20 ;i++){
//            System.out.println("hello");
//        }

        // now trying with the runnable interface
        runnableexample rb = new runnableexample();
        Thread t1 = new Thread(rb);
        t1.start();

        for (int i=0 ; i<20 ;i++){
            System.out.println("hello");
        }

        // so now parallely the hello and the world will be printed likewise here
    }
}
