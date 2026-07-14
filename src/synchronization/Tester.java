package synchronization;

public class Tester {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Mythread t1 = new Mythread(counter);
        Mythread t2 = new Mythread(counter);

        t1.start();
        t2.start();

        // now  we should get the count as the 2000 becuse two threads and increment by 2 so like yeah that's why
        // so first we will wait for the two threads two complete likewise

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println(counter.getcount());
        // but here sometimes we are getting 2000 but sometimes like the value less than that we are getting
    }
}
