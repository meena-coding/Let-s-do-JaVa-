package in.MeenaCoding.MultiThreading.synchronize;

public class TestingSynchronize {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        counter Counter = new counter();
        updaterThread t1 = new updaterThread(Counter);
        updaterThread t2 = new updaterThread(Counter);


        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        }catch (InterruptedException exception){
            System.out.println("Thread Interrupted: " + exception.getMessage());
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Final counter value: %d and time taken: %d", Counter.getCount(), (endTime - startTime));
    }
}
