package in.aryancoding.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThreadService {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newSingleThreadExecutor()) {

            printNumbers task = new printNumbers();
            service.submit(task);
        }
    }
}
