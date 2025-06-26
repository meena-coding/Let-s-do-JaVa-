package in.aryancoding.challenge99;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        t1.start();
//        Thread.sleep(5000);
        t2.start();
    }
}
