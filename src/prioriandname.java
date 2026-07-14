public class prioriandname extends Thread{

    public prioriandname(String name){
        super(name); // this will like set the name on the top only likewise
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(Thread.currentThread().getName() + " priority is "+Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        prioriandname thread1low = new prioriandname("Vatsal low priority");
        prioriandname thread2medium=new prioriandname("Vatsal medimum priority");
        prioriandname thread3high=new prioriandname("Vatsal high priority");

        thread1low.setPriority(Thread.MIN_PRIORITY);
        thread2medium.setPriority(Thread.NORM_PRIORITY); // by default the threads are of this priority only so yeah like wise
        thread3high.setPriority(Thread.MAX_PRIORITY);

        thread3high.start();
        thread1low.start();
        thread2medium.start();

    }
}
