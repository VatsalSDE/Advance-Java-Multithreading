package Example1;
public class Main {

    public static void main(String[] args) {

        Box box = new Box();

        Thread producer =
                new Thread(new Producer(box), "Producer");

        Thread consumer =
                new Thread(new Consumer(box), "Consumer");

        producer.start();
        consumer.start();

    }

}
