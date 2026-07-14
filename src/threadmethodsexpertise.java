public class threadmethodsexpertise extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            try {
//                Thread.sleep(500); // pauses the current thread likewise and then like it executes teh work
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
            System.out.println("Hello from thread");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        threadmethodsexpertise t1 = new threadmethodsexpertise();
        t1.start();
        t1.join(); // now here the main method will only work it's operations when the t1 thread terminates and it is like been done by the join method
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello from main");
        }
    }
}
