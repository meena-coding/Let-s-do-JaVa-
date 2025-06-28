package in.aryancoding.challenge104;

public class sleepTask implements Runnable{

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("\nStarted with Thread: %s", current.getName());

        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("\nEnded with Thread: %s", current.getName());

    }


        private int getRandom(){

        double random = Math.random() * 5 + 1;

        return (int) random;
        }
    }
