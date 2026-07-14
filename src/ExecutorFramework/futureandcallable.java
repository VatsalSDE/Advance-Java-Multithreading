package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class futureandcallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> future = executorService.submit(() -> {
            try{
                Thread.sleep(1000);
            }
            catch(Exception e ) {}

            return 10;
        });

        // and the now we want to get the future value so like here we need to use teh .get method and wrap inside the exception handling too ok
        try
        {
            System.out.println(future.get());  // the get functions block the thread which is implemenitoing
        }
        catch (Exception e ){

        }
        finally {
            executorService.shutdown();
        }
    }
}
