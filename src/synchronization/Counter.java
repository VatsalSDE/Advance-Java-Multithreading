package synchronization;

public class Counter {
    private int count;

    public synchronized void  increment(){
        count++;
    }

    public int getcount(){
        return count;
    }
}
