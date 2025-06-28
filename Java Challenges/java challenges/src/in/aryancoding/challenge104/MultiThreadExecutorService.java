package in.aryancoding.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutorService{

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            for (int i = 0; i < 10; i++) {

                sleepTask task = new sleepTask();
                service.submit(task);
            }

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("\nEMERGENCY SHUTDOWN");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
