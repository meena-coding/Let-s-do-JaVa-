package in.MeenaCoding.Executor.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        fetchName task1 = new fetchName("Aryan");
        fetchName task2 = new fetchName("bharat");
        fetchName task3 = new fetchName("Swati");
        fetchName task4 = new fetchName("Mayank");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\nFull name is: %s", name1.get());
        System.out.printf("\nFull name is: %s", name2.get());
        System.out.printf("\nFull name is: %s", name3.get());
        System.out.printf("\nFull name is: %s", name4.get());

        service.shutdown();
    }
}
