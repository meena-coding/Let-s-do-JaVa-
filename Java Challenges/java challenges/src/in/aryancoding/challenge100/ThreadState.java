package in.aryancoding.challenge100;

public class ThreadState extends Thread{

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.printf("\nFrom inside run: %s",Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
