package in.aryancoding.challenge99;

public class HelloThread extends Thread{

    private final int ThreadNumber;

    public HelloThread(int threadNumber) {
        ThreadNumber = threadNumber;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d)Hello from Thread: %d\n", (i + 1), ThreadNumber);

        }
    }
}
