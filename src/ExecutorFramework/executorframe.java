package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorframe {

    public static void main(String[] args) {
        // executor framework example in java

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // now we will provide the runnable to the executorService only

        // number of tasks
        // and here we also pass the runnable only likewise

        for(int i=1;i<=5;i++){

            int taskID=i;
            executorService.execute(() -> {
                System.out.println("Task "+taskID+" is performed by "+Thread.currentThread().getName());
            });
        }

        // always do this
        executorService.shutdown();
    }
}
