package AdvanceMultithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class completablefut {
    public static void main(String[] args) {
//        CompletableFuture<Integer> f1 =
//                CompletableFuture.supplyAsync(() -> 10)
//                        .thenApply(result -> result*2) // here it gives the transformer type functional interface like now
//                        .thenApply(result -> result*2);
//
//        try {
//            System.out.println(f1.get());
//        }
//        catch (Exception e) {}
//
//        // now the consumer functional interface that is
//        // thenApply return the new value
          // thenAccept consuimes the value and here we can pr
            CompletableFuture<Void> f2 =
                    CompletableFuture.supplyAsync(() -> 18)
                            .thenAccept(result -> System.out.println(result));



    }
}
