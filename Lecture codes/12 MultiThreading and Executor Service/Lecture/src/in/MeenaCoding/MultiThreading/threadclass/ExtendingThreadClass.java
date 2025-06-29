package in.MeenaCoding.MultiThreading.threadclass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting First Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third Thread");
        t3.start();

        long end = System.currentTimeMillis();
        System.out.printf("Total time taken is %d millisecond", (end - start));

    }

}
