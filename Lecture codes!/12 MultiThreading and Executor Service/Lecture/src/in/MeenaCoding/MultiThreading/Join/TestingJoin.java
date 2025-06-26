package in.MeenaCoding.MultiThreading.Join;

import in.MeenaCoding.MultiThreading.Runnable.PrintTask;

public class TestingJoin {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('#');
        PrintTask p3 = new PrintTask('@');

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        t1.join();   //At this point, This will wait until t1 task get completed
        Thread t3 = new Thread(p3);
        t3.start();

        long end = System.currentTimeMillis();
        System.out.printf("Total time taken is %d millisecond", (end - start));
    }
}
