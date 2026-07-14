package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class submitandexecute {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // we can't catch this exception likewise
        // even with the try catch block okk so yeah like that
//        executorService.execute(() -> {
//            int x = 10/0;
//        });

        Future<Integer> f1 = executorService.submit(() ->{
            return (10/0);
        });

        try{
            System.out.println(f1.get());
        }
        catch (Exception e){
            System.out.println("Catched submit exception");
        }
    }
}
