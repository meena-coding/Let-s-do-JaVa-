package in.aryancoding.challenge101;

public class printThread extends Thread{

    private final int ThreadNumber;

    public printThread(int threadNumber) {
        ThreadNumber = threadNumber;
    }

    @Override
    public void run() {

        System.out.printf("%s Thread Starting: %d\n", Thread.currentThread().getName(),ThreadNumber);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended: %d\n", Thread.currentThread().getName(),ThreadNumber);

    }
}
