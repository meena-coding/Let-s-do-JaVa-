package in.MeenaCoding.MultiThreading.Runnable;

public class PrintTask implements Runnable{


    @Override
    public void run() {

        //First Task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d %c", i, targetChar);
        }
        System.out.printf("\n%s %c Task is completed", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
