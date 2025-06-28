package in.aryancoding.challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(4)) {

            List<Future<Integer>> list = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                FactorialCalculator task = new FactorialCalculator(i);
                list.add(service.submit(task));
            }

            for (Future<Integer> integerFuture : list) {
                System.out.printf("\n Result is : %d", integerFuture.get());
            }
            service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("\nBohot hua.");
                service.shutdownNow();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
