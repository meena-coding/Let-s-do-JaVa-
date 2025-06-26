package in.MeenaCoding.MultiThreading.synchronize;

public class updaterThread extends Thread{

    private final counter Counter;

    public updaterThread(counter counter) {
        Counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Counter.increment();
        }
    }
}
