public class exceptionCheck extends Thread{

    @Override
    public void run(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
            Thread t = new Thread();
            t.start();
    }
}
