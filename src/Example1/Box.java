package Example1;

class Box {

    private String item;

    public synchronized void produce(String value) throws InterruptedException {

        while(item != null){
            wait();
        }

        item = value;
        System.out.println(Thread.currentThread().getName() +
                " Produced : " + item);

        notify();
    }

    public synchronized void consume() throws InterruptedException {

        while(item == null){
            wait();
        }

        System.out.println(Thread.currentThread().getName() +
                " Consumed : " + item);

        item = null;

        notify();
    }
}