package in.MeenaCoding.MultiThreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        //First Task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n* Task is completed");

        //Second Task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n$ Task is completed");

        //Third Task
        for (int i = 1; i <= 1000 ; i++) {
            System.out.printf("%d@ ", i);
        }
        System.out.println("\n@ Task is completed");

        long end = System.currentTimeMillis();
        System.out.printf("Total time taken is %d millisecond", (end - start));
    }

}
