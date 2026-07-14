package ExecutorFramework;

import java.util.concurrent.*;

public class threadpool {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // making our own now
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5));

        for(int i=1;i<=5;i++){
            int taskID=1;

            executor.execute(() -> {
                System.out.println("Task "+taskID+" is performed by "+Thread.currentThread().getName());
            });

            try{
                Thread.sleep(5000);
            }
            catch (Exception e){

            }
        }
        executor.shutdown();

    }
}
